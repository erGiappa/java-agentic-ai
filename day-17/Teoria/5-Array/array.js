
// ==========================================
// 5. ARRAY
// ==========================================

// Creiamo un array di nomi
const studenti = ["John", "Michael", "John Michael"];

// Gli array partono dall'indice 0
console.log(studenti[0]); // John
console.log(studenti[1]); // Michael
console.log(studenti[2]); // John Michael

// Lunghezza dell'array
console.log(studenti.length);

// PUSH: aggiunge un elemento alla fine
studenti.push("Baticos");

// POP: rimuove l'ultimo elemento
studenti.pop();

// UNSHIFT: aggiunge un elemento all'inizio
studenti.unshift("Johnny");

// SHIFT: rimuove il primo elemento
studenti.shift();

// MAP: crea un nuovo array trasformando gli elementi
const studentiMaiuscolo = studenti.map(function(nome) {
    return nome.toUpperCase();
});

console.log(studentiMaiuscolo);

// FILTER: seleziona solo alcuni elementi
const nomiLunghi = studenti.filter(function(nome) {
    return nome.length > 4;
});

console.log(nomiLunghi);

// FOREACH: esegue un'operazione per ogni elemento
studenti.forEach(function(nome) {
    console.log("Studente:", nome);
});
