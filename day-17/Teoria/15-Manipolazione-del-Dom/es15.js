// ==========================================
// 15. MANIPOLAZIONE DEL DOM
// ==========================================

// Recuperiamo gli elementi HTML tramite ID
const titolo = document.getElementById("titolo");
const descrizione = document.getElementById("descrizione");
const bottone = document.getElementById("bottone");

// Modifichiamo il contenuto HTML
titolo.textContent = "Ciao, JavaScript!";
descrizione.textContent = "Il testo è stato modificato!";

// EVENT LISTENER
// Quando l'utente clicca sul bottone,
// viene eseguita la funzione.

bottone.addEventListener("click", function() {

    titolo.textContent = "Hai cliccato il bottone!";

    descrizione.textContent = "JavaScript sta funzionando correttamente!";

});
