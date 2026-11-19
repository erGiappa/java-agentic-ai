
// ==========================================
// 11. JAVASCRIPT MODERNO (ES6+)
// ==========================================

// DESTRUCTURING DEGLI ARRAY

const colori = ["Rosso", "Verde", "Blu"];

const [primo, secondo, terzo] = colori;

console.log(primo);
console.log(secondo);
console.log(terzo);


// DESTRUCTURING DEGLI OGGETTI

const persona = {
    nome: "John",
    eta: 30,
    professione: "Developer"
};

const { nome, eta, professione } = persona;

console.log(nome);
console.log(eta);
console.log(professione);


// SPREAD OPERATOR (...)
// Permette di copiare ed espandere gli elementi.

// Copiare un array
const numeri = [1, 2, 3];
const nuoviNumeri = [...numeri, 4, 5];

console.log(nuoviNumeri);


// Unire due array
const arrayA = [10, 20];
const arrayB = [30, 40];

const arrayUnito = [...arrayA, ...arrayB];

console.log(arrayUnito);


// Copiare un oggetto
const utente = {
    nome: "Michael",
    eta: 25
};

const utenteCompleto = {
    ...utente,
    ruolo: "Admin"
};

console.log(utenteCompleto);
