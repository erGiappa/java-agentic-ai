
// ==========================================
// 4. TIPI DI DATI
// ==========================================

// STRING: testo
let nomeUtente = "John Michael Baticos";

// NUMBER: numeri interi e decimali
let etaUtente = 30;
let prezzo = 19.99;

// BOOLEAN: vero o falso
let isOnline = true;
let isAdmin = false;

// NULL: assenza intenzionale di valore
let indirizzo = null;

// UNDEFINED: valore non assegnato
let telefono;

// BIGINT: numeri interi molto grandi
let numeroGrande = 12345678901234567890n;

// SYMBOL: valore identificativo unico
let identificatore = Symbol("id");

// Verifichiamo i tipi
console.log(typeof nomeUtente);
console.log(typeof etaUtente);
console.log(typeof isOnline);
console.log(typeof telefono);
console.log(typeof numeroGrande);
console.log(typeof identificatore);

// Attenzione:
// typeof null restituisce "object".
// È una particolarità storica di JavaScript.
console.log(typeof indirizzo);
