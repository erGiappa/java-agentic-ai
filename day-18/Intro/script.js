
// PARTE 3 - VARIABILI: VAR, LET, CONST

// ESERCIZIO 3.1 - DIFFERENZA TRA VAR E LET


// VAR
// var permette di dichiarare nuovamente
// una variabile con lo stesso nome.

var messaggio = "Ciao";

console.log(messaggio);

// Ridichiarazione della stessa variabile.
// Non genera nessun errore.
var messaggio = "Altro";

console.log(messaggio);


// LET
// let NON permette di dichiarare due volte
// una variabile con lo stesso nome nello stesso scope.

// Per provare questo comportamento, decommenta
// le due righe seguenti:
//
// let messaggioLet = "Ciao";
// let messaggioLet = "Altro";
//
// Il browser mostrerà un SyntaxError nella console.
//
// NOTA: il codice successivo a questo errore
// non verrà eseguito se lasci le righe attive.



// ESERCIZIO 3.2 - UTILIZZO DI LET E CONST



// VARIABILI LET
// Utilizziamo let quando sappiamo che il valore
// della variabile dovrà cambiare.

// Prima variabile let
let eta = 29;

// Riassegnazione: consentita
eta = 30;

console.log("Età:", eta);


// Seconda variabile let
let contatore = 0;

// Riassegnazione: consentita
contatore = 1;

console.log("Contatore:", contatore);


// Terza variabile let
let colore = "Rosso";

// Riassegnazione: consentita
colore = "Blu";

console.log("Colore:", colore);


// VARIABILI CONST
// Utilizziamo const quando non vogliamo
// riassegnare un nuovo valore alla variabile.

// Prima variabile const
const nome = "John";

// Riassegnazione NON consentita:
// nome = "Luca"; // TypeError

console.log("Nome:", nome);


// Seconda variabile const
const piGreco = 3.14159;

// Riassegnazione NON consentita:
// piGreco = 3.14; // TypeError

console.log("Pi greco:", piGreco);


// Terza variabile const
const paese = "Italia";

// Riassegnazione NON consentita:
// paese = "Francia"; // TypeError

console.log("Paese:", paese);


// IMPORTANTE:
// Le righe che provocano errori sono commentate.
// Per provare gli errori, rimuovi // davanti
// alla singola riassegnazione.



// ESERCIZIO 3.3 - REGOLA PRATICA


// REGOLA:
// Utilizzare const come scelta predefinita.
// Utilizzare let soltanto quando il valore cambia.
// Evitare completamente var.


// 1. Nome di un utente che non cambia dopo il login

// CONST perché il nome viene assegnato
// dopo il login e non deve essere riassegnato.
const nomeUtente = "Michael";

console.log("Nome utente:", nomeUtente);


// 2. Contatore che parte da 0 e viene incrementato

// LET perché il valore cambia ogni volta
// che incrementiamo il contatore.
let contatorePartite = 0;

contatorePartite++;
contatorePartite++;
contatorePartite++;

console.log("Contatore partite:", contatorePartite);


// 3. URL di un'API che resta fisso

// CONST perché l'indirizzo dell'API
// rimane sempre lo stesso.
const urlApi = "https://api.example.com";

console.log("URL API:", urlApi);


// 4. Punteggio di un giocatore durante una partita

// LET perché il punteggio aumenta o diminuisce
// durante lo svolgimento della partita.
let punteggio = 0;

punteggio = punteggio + 10;
punteggio = punteggio + 5;

console.log("Punteggio giocatore:", punteggio);


// 5. Valore di Pi greco

// CONST perché utilizziamo un valore fisso
// che non deve essere riassegnato.
const pi = 3.14159265359;

console.log("Valore di Pi greco:", pi);



// FINE DEGLI ESERCIZI


console.log("Tutti gli esercizi sono terminati!");
