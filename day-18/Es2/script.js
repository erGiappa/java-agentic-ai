
const schedaTecnicaComputer = {
    marca: "Apple",
    modello: "MacBook Pro",
    processore: "M3",
    ram: "16GB",
    memoria: "512GB SSD",
    prezzo: 1999,
    sistemaOperativo: "macOS"
};

// 1. Creare una proprietà con la notazione del punto
schedaTecnicaComputer.colore = "Grigio";

// 2. Creare una proprietà con le parentesi quadre
schedaTecnicaComputer["nome"] = "MacBook Pro M3";

// 3. Eliminare una proprietà con la notazione del punto
delete schedaTecnicaComputer.colore;

// 4. Eliminare una proprietà con le parentesi quadre
delete schedaTecnicaComputer["memoria"];

// 5. Sovrascrivere proprietà con la notazione del punto
schedaTecnicaComputer.prezzo = 1799;
schedaTecnicaComputer.ram = "32GB";

// 6. Sovrascrivere proprietà con le parentesi quadre
schedaTecnicaComputer["nome"] = "MacBook Pro M4";
schedaTecnicaComputer["sistemaOperativo"] = "macOS Sequoia";

// Visualizzare il risultato finale
console.log(schedaTecnicaComputer);
console.table(schedaTecnicaComputer);
