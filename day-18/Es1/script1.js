const schedaTecnicaComputer = {
    marca: "Apple",
    modello: "Macbook air",
    processore: "m4",
    ram: "16gb",
    memoria: "128gb",
    prezzo: 1200

};

// 1. visualizzare l'intero oggetto
console.log(schedaTecnicaComputer);

//2. visualizzare l'oggetto sotto forma di tabella
console.log(schedaTecnicaComputer)

// 3. Accedere alle singole proprietà con la notazione del punto
console.log(schedaTecnicaComputer.marca);
console.log(schedaTecnicaComputer.modello);

// 4. Accedere alle proprietà con le parentesi quadre
console.log(schedaTecnicaComputer["processore"]);
console.log(schedaTecnicaComputer["ram"]);