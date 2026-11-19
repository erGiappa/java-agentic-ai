// ==========================================
// 10. CICLI
// ==========================================

// CICLO FOR
// Ripete un'operazione un determinato numero di volte.

for (let i = 0; i < 5; i++) {
    console.log("Numero:", i);
}


// CICLO FOR OF
// Scorre gli elementi di un array.

const linguaggi = ["HTML", "CSS", "JavaScript", "PHP"];

for (const linguaggio of linguaggi) {
    console.log(linguaggio);
}


// CICLO WHILE
// Continua finché la condizione è vera.

let contatore = 0;

while (contatore < 3) {
    console.log("Contatore:", contatore);
    contatore++;
}
