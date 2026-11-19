// ==========================================
// 14. PROMISE E ASYNC/AWAIT
// ==========================================

// Una Promise rappresenta un'operazione
// che potrebbe terminare in futuro.

const richiesta = new Promise((resolve, reject) => {

    const successo = true;

    if (successo) {
        resolve("Operazione completata!");
    } else {
        reject("Si è verificato un errore");
    }

});

// THEN: gestisce il risultato positivo
// CATCH: gestisce gli errori

richiesta
    .then((risultato) => {
        console.log(risultato);
    })
    .catch((errore) => {
        console.log(errore);
    });


// ASYNC / AWAIT

function attendi() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Dati ricevuti!");
        }, 1000);
    });
}

async function eseguiRichiesta() {

    console.log("Attendo i dati...");

    const risultato = await attendi();

    console.log(risultato);
}

eseguiRichiesta();
