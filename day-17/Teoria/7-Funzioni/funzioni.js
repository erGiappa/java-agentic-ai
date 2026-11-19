// ==========================================
// 7. FUNZIONI
// ==========================================

// FUNZIONE CLASSICA
function saluta() {
    console.log("Ciao, benvenuto!");
}

// Richiamiamo la funzione
saluta();


// FUNZIONE CON PARAMETRI
function presenta(nome, eta) {
    console.log("Mi chiamo " + nome);
    console.log("Ho " + eta + " anni");
}

presenta("John Michael", 30);


// FUNZIONE CON RETURN
function somma(a, b) {
    return a + b;
}

const risultato = somma(10, 20);

console.log("Risultato:", risultato);


// ARROW FUNCTION
const saluto = () => {
    console.log("Ciao da una Arrow Function!");
};

saluto();


// ARROW FUNCTION COMPATTA
const moltiplica = (a, b) => a * b;

console.log(moltiplica(5, 4));


// PARAMETRO CON VALORE PREDEFINITO
function benvenuto(nome = "Ospite") {
    console.log(`Benvenuto ${nome}!`);
}

benvenuto();
benvenuto("John Michael");
