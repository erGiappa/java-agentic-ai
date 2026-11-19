// ==========================================
// 8. STRINGHE
// ==========================================

const testo = "JavaScript è fantastico";

// Lunghezza della stringa
console.log(testo.length);

// Tutto maiuscolo
console.log(testo.toUpperCase());

// Tutto minuscolo
console.log(testo.toLowerCase());

// Verificare se contiene una parola
console.log(testo.includes("JavaScript"));

// Sostituire una parola
console.log(testo.replace("fantastico", "potente"));

// Eliminare spazi iniziali e finali
const nome = "  John  ";
console.log(nome.trim());

// TEMPLATE LITERALS
const studenteNome = "John Michael";
const voto = 28;

// Utilizziamo i backtick ` `
// Per inserire variabili utilizziamo ${}
const frase = `Lo studente ${studenteNome} ha preso ${voto}`;

console.log(frase);
