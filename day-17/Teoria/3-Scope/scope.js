// ==========================================
// 3. SCOPE DELLE VARIABILI
// ==========================================

// ESEMPIO CON VAR
if (true) {
    var messaggio = "Ciao da VAR";
}

console.log(messaggio);
// Funziona perché var ignora lo scope del blocco.

// ESEMPIO CON LET
if (true) {
    let messaggioLet = "Ciao da LET";
    console.log(messaggioLet);
}

// console.log(messaggioLet);
// ERRORE: let esiste solo dentro il blocco.

// ESEMPIO CON CONST
if (true) {
    const messaggioConst = "Ciao da CONST";
    console.log(messaggioConst);
}

// console.log(messaggioConst);
// ERRORE: const è block scoped.
