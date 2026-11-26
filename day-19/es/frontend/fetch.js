const prefersReducedMotion = window.matchMedia('(prefers-reduced-motion: reduce)').matches;
const revealObserver = 'IntersectionObserver' in window
    ? new IntersectionObserver(entries => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('is-visible');
                animateCounters(entry.target);
                revealObserver.unobserve(entry.target);
            }
        });
    }, { threshold: 0.15 })
    : null;

if (revealObserver) {
    document.documentElement.classList.add('motion-ready');
}

function animateCounters(card) {
    card.querySelectorAll('[data-count]').forEach(counter => {
        const target = Number(counter.dataset.count);

        if (prefersReducedMotion || !Number.isFinite(target)) {
            counter.textContent = counter.dataset.count;
            return;
        }

        const duration = 650;
        const startTime = performance.now();

        function updateCounter(now) {
            const progress = Math.min((now - startTime) / duration, 1);
            counter.textContent = String(Math.round(target * progress));

            if (progress < 1) {
                requestAnimationFrame(updateCounter);
            }
        }

        requestAnimationFrame(updateCounter);
    });
}

function observeCards(container) {
    const cards = container.querySelectorAll('.reveal-on-scroll');

    if (!revealObserver) {
        cards.forEach(card => {
            card.classList.add('is-visible');
            animateCounters(card);
        });
        return;
    }

    cards.forEach(card => revealObserver.observe(card));
}

function showSkeletons(container, count = 3) {
    container.setAttribute('aria-busy', 'true');
    container.innerHTML = Array.from({ length: count }, () => `
        <div class="skeleton-card" aria-hidden="true">
            <div class="skeleton-line"></div>
            <div class="skeleton-line"></div>
            <div class="skeleton-line"></div>
        </div>
    `).join('');
}

function loadCollection(url, selector, getItems, renderItem) {
    const container = document.querySelector(selector);
    showSkeletons(container);

    fetch(url)
        .then(response => {
            if (!response.ok) {
                throw new Error(`Richiesta non riuscita: ${response.status}`);
            }
            return response.json();
        })
        .then(data => {
            const items = getItems(data);
            container.innerHTML = items.map(renderItem).join('');
            container.setAttribute('aria-busy', 'false');
            observeCards(container);
        })
        .catch(error => {
            console.error(`Errore nel caricamento di ${selector}:`, error);
            container.innerHTML = '<p class="load-error" role="alert">Impossibile caricare i dati. Riprova più tardi.</p>';
            container.setAttribute('aria-busy', 'false');
        });
}

const recipesBox = document.querySelector('#recipes_list');

recipesBox.addEventListener('click', event => {
    const button = event.target.closest('.recipe-toggle');
    if (!button) return;

    const instructions = document.getElementById(button.getAttribute('aria-controls'));
    const isExpanded = button.getAttribute('aria-expanded') === 'true';

    button.setAttribute('aria-expanded', String(!isExpanded));
    instructions.setAttribute('aria-hidden', String(isExpanded));
    instructions.classList.toggle('is-open', !isExpanded);
    button.textContent = isExpanded ? 'Mostra istruzioni' : 'Nascondi istruzioni';
});

loadCollection('https://dummyjson.com/recipes', '#recipes_list', data => data.recipes, recipe => `
    <div class="recipe-card reveal-on-scroll">
        <img src="${recipe.image}" alt="${recipe.name}">
        <div class="recipe-content">
            <h2>${recipe.name}</h2>
            <button class="recipe-toggle" type="button" aria-expanded="false" aria-controls="recipe-instructions-${recipe.id}">
                Mostra istruzioni
            </button>
            <div class="recipe-instructions" id="recipe-instructions-${recipe.id}" aria-hidden="true">
                <div class="recipe-instructions-inner">
                    <h4>Come fare questa ricetta</h4>
                    <ul>
                        ${recipe.instructions.map(operation => `<li>${operation}</li>`).join('')}
                    </ul>
                </div>
            </div>
        </div>
    </div>
`);

loadCollection('https://dummyjson.com/users', '#users_list', data => data.users, user => `
    <div class="user-card reveal-on-scroll">
        <img src="${user.image}" alt="${user.firstName}">
        <div class="user-content">
            <h2>${user.firstName} ${user.lastName}</h2>
            <p>Email: ${user.email}</p>
            <p>Età: ${user.age}</p>
            <p>Telefono: ${user.phone}</p>
            <p>Città: ${user.address.city}</p>
        </div>
    </div>
`);



function renderCartTemplate(cart) {

    return `
        <div class="cart-card reveal-on-scroll">

            <div class="cart-content">

                <h2>Carrello numero ${cart.id}</h2>

                <p>Utente ID: ${cart.userId}</p>

                <p>Numero prodotti: <span data-count="${cart.totalProducts}">0</span></p>

                <p>Quantità totale: <span data-count="${cart.totalQuantity}">0</span></p>

                <p>Prezzo totale: ${cart.total} €</p>

                <h4>Prodotti acquistati:</h4>

                <ul>
                    ${cart.products.map(product => `
                        <li>
                            ${product.title} -
                            Quantità: ${product.quantity} -
                            Prezzo: ${product.price} €
                        </li>
                    `).join('')}
                </ul>

            </div>

        </div>
    `;

}



function renderPostTemplate(post) {

    return `
        <div class="post-card reveal-on-scroll">

            <div class="post-content">

                <h2>${post.title}</h2>

                <p>${post.body}</p>

                <p>Visualizzazioni: <span data-count="${post.views}">0</span></p>

                <p>Mi piace: <span data-count="${post.reactions.likes}">0</span></p>

                <p>Non mi piace: <span data-count="${post.reactions.dislikes}">0</span></p>

            </div>

        </div>
    `;

}


loadCollection('https://dummyjson.com/posts', '#posts_list', data => data.posts, renderPostTemplate);
loadCollection('https://dummyjson.com/carts', '#carts_list', data => data.carts, renderCartTemplate);
