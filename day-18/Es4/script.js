// 1. DICHIARAZIONE DEGLI OGGETTI


const schedaTecnicaComputer = {
    marca: "Asus",
    modello: "VivoBook S14",
    prezzoEUR: 849.99,
    cpu: {
        nome: "Intel Core i5-1135G7",
        frequenzaGHz: 2.4,
        core: 4,
        threads: 8
    },
    ramGB: 16,
    storage: [
        { tipo: "SSD", capacitaGB: 512 },
        { tipo: "HDD", capacitaGB: 0 }
    ],
    gpu: {
        integrata: true,
        nome: "Intel Iris Xe",
        memoriaGB: 0
    },
    porte: ["USB-C", "USB-A x2", "HDMI", "jack 3.5mm"],
    dimensioniPollici: 14,
    pesoKg: 1.4,
    sistemaOperativo: "Windows 11 Home",
    funzionalita: {
        wifi: "802.11ax",
        bluetooth: "5.0",
        lettoreSD: false,
        retroilluminata: true
    }
};

const proprietàImmobiliare = {
    indirizzo: "Via Roma 24, Milano",
    tipologia: "Appartamento",
    metraturaMQ: 85,
    camere: 3,
    bagni: 2,
    piano: 2,
    annoCostruzione: 2010,
    riscaldamento: "Autonomo",
    speseCondominialiEUR: 120,
    garage: true,
    balcone: true,
    affitto: false,
    prezzoEUR: 320000,
    servizi: ["Ascensore", "Portineria", "Videocitofono"],
    stato: "Ottimo"
};

const drone = {
    marca: "DJI",
    modello: "Mini 3",
    pesoKg: 0.86,
    autonomiaMinuti: 38,
    velocitaMassimaKmH: 57,
    videocamera: {
        risoluzione: "4K",
        fps: 30,
        stabilizzazione: "3 assi"
    },
    sensori: ["GPS", "Vision Positioning", "Obstacle Sensing"],
    batteria: {
        capacitaMah: 2250,
        tipo: "LiPo"
    },
    distanzaMassimaControlloM: 10000,
    portaSD: true,
    funzionalita: {
        followMe: true,
        ritornoAutomatico: true,
        decolloAtterraggioAutomatico: true
    }
};



// 2. LOOP FOREACH


console.log("\n========== LOOP FOREACH ==========");

const oggetti = [
    schedaTecnicaComputer,
    proprietàImmobiliare,
    drone
];

oggetti.forEach((oggetto, indice) => {
    console.log("\nOGGETTO:", indice + 1);

    Object.keys(oggetto).forEach(chiave => {
        console.log(chiave + ":", oggetto[chiave]);
    });
});



// 3. LOOP FOR CLASSICO


console.log("\n========== LOOP FOR CLASSICO ==========");

oggetti.forEach((oggetto, indice) => {
    console.log("\nOGGETTO:", indice + 1);

    const chiavi = Object.keys(oggetto);

    for (let i = 0; i < chiavi.length; i++) {
        let chiave = chiavi[i];

        console.log(chiave + ":", oggetto[chiave]);
    }
});


// 4. LOOP FOR...IN


console.log("\n========== LOOP FOR...IN ==========");

oggetti.forEach((oggetto, indice) => {
    console.log("\nOGGETTO:", indice + 1);

    for (let chiave in oggetto) {
        if (Object.hasOwn(oggetto, chiave)) {
            console.log(chiave + ":", oggetto[chiave]);
        }
    }
});

