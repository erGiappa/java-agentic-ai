
// ==========================================
// 9. CONDIZIONI
// ==========================================

const eta = 30;

if (eta >= 18) {
    console.log("Sei maggiorenne");
} else {
    console.log("Sei minorenne");
}


// ELSE IF
const voto = 27;

if (voto >= 30) {
    console.log("Ottimo!");
} else if (voto >= 24) {
    console.log("Buon risultato!");
} else if (voto >= 18) {
    console.log("Esame superato");
} else {
    console.log("Esame non superato");
}


// OPERATORI DI CONFRONTO
console.log(10 > 5);
console.log(10 < 5);
console.log(10 === 10);
console.log(10 !== 5);
console.log(10 >= 10);


// OPERATORI LOGICI
const maggiorenne = true;
const patente = true;

// AND: entrambe le condizioni devono essere vere
console.log(maggiorenne && patente);

// OR: almeno una condizione deve essere vera
console.log(maggiorenne || patente);

// NOT: inverte il valore booleano
console.log(!maggiorenne);
