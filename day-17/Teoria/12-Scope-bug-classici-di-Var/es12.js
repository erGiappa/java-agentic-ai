
// ==========================================
// 13. BUG CLASSICI DI VAR
// ==========================================

// BUG 1: VAR IGNORA LO SCOPE DEL BLOCCO

if (true) {
    var numero = 100;
}

console.log(numero);
// Stampa 100, anche fuori dal blocco.


// BUG 2: REDECLARATION

var nome = "John";
var nome = "Michael";

console.log(nome);
// Stampa Michael senza generare un errore.


// BUG 3: DIFFERENZA TRA VAR E LET NEI CICLI

// Esempio con VAR
for (var i = 0; i < 3; i++) {
    // Il ciclo termina con i = 3.
}

console.log(i);
// Stampa 3 perché var non è block scoped.


// Esempio con LET
for (let j = 0; j < 3; j++) {
    console.log(j);
}

// console.log(j);
// ERRORE: j non esiste fuori dal ciclo.
