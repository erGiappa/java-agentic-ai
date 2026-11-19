
// ==========================================
// 6. OGGETTI
// ==========================================

// Creiamo un oggetto studente
const studente = {
    nome: "John Michael",
    cognome: "Baticos",
    eta: 29,
    corso: "Full Stack Developer",
    attivo: true
};

// Accedere alle proprietà
console.log(studente.nome);
console.log(studente.cognome);
console.log(studente.eta);

// Metodo alternativo
console.log(studente["corso"]);

// Aggiungere una proprietà
studente.email = "john.michael@email.com";

// Modificare una proprietà
studente.eta = 30;

// Eliminare una proprietà
delete studente.attivo;

console.log(studente);
