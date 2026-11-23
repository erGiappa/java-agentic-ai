"use strict";

// 1. OBJECT.DEFINEPROPERTY()
// Aggiungere una proprietà a un oggetto

console.log("Esercizio 1");

const persona = {
    nome: "John Michael",
    cognome: "Baticos"
};

Object.defineProperty(persona, "eta", {
    value: 30, 
    writable: true,
    enumerable: true,
    configurable: true

});

console.log("Età:", persona.eta);
console.log("Oggetto persona:", persona);

// 2. OBJECT.CREATE()
// Creare un oggetto definendo ogni proprietà 

console.log("Esercizio 2")

const automobile =  Object.create({}, {
    marca: {
        value: "Fiat",
        writable: true,
        enumerable: true,
        configurable: true
    },
    modello: {
        value: "Panda",
        writable: true,
        enumerable: true,
        configurable: true
    },
    anno: {
        value: 2022,
        writable: true,
        enumerable: true,
        configurable: true
    }
});

console.log("Marca:", automobile.marca);
console.log("Modello:", automobile.modello);
console.log("Anno:", automobile.anno);

// 3. OBJECT.DEFINEPROPERTY()
// Impostare writable: false

console.log("Esercizio 3");

Object.defineProperty(automobile, "marca", {
    writable: false
});

console.log("Marca originale:", automobile.marca);

// Proviamo a sovrascrivere la proprietà
try {
    automobile.marca = "BMW";
} catch (errore) {
    console.log("Errore:", errore.message);
}

console.log("Marca dopo la modifica:", automobile.marca);


// 4. OBJECT.FREEZE()
// Bloccare completamente un oggetto


console.log("Esercizio 4");

const studente = {
    nome: "Luca",
    eta: 20
};

Object.freeze(studente);

// Proviamo a modificare
try {
    studente.nome = "Marco";
} catch (errore) {
    console.log("Modifica:", errore.message);
}

// Proviamo a eliminare
try {
    delete studente.eta;
} catch (errore) {
    console.log("Eliminazione:", errore.message);
}

// Proviamo ad aggiungere
try {
    studente.voto = 30;
} catch (errore) {
    console.log("Aggiunta:", errore.message);
}

console.log("Oggetto dopo freeze:", studente);



// 5. OBJECT.SEAL()
// Impedire aggiunte ed eliminazioni


console.log("Esercizio 5");

const prodotto = {
    nome: "Computer",
    prezzo: 800
};

Object.seal(prodotto);

// Proviamo a modificare una proprietà
try {
    prodotto.prezzo = 1000;
} catch (errore) {
    console.log("Modifica:", errore.message);
}

// Proviamo a eliminare una proprietà
try {
    delete prodotto.nome;
} catch (errore) {
    console.log("Eliminazione:", errore.message);
}

// Proviamo ad aggiungere una proprietà
try {
    prodotto.marca = "HP";
} catch (errore) {
    console.log("Aggiunta:", errore.message);
}

console.log("Oggetto dopo seal:", prodotto);



// 6. VERIFICA FINALE


console.log("VERIFICA FINALE");

console.log("Studente congelato:", Object.isFrozen(studente));
console.log("Prodotto sigillato:", Object.isSealed(prodotto));

console.log("Fine esercizio!");