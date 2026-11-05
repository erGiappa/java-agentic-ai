//26. Vincolo NOT NULL

CREATE TABLE dipendenti (
                            id_dipendente INT AUTO_INCREMENT PRIMARY KEY,
                            nome VARCHAR(50) NOT NULL,
                            cognome VARCHAR(50) NOT NULL
);

//27. Vincolo UNIQUE multiplo

CREATE TABLE fornitori (
                           id_fornitore INT AUTO_INCREMENT PRIMARY KEY,
                           nome VARCHAR(100),
                           citta VARCHAR(100),

                           CONSTRAINT unique_nome_citta UNIQUE (nome, citta)
);

//28. Vincolo Check

CREATE TABLE stipendi (
                          id_stipendio INT AUTO_INCREMENT PRIMARY KEY,
                          dipendente VARCHAR(100),
                          importo DECIMAL(10,2),

                          CONSTRAINT check_importo CHECK (importo > 1000)
);

//29. Vincolo DEFAULT su testo

CREATE TABLE utenti_registrati (
                                   id_utente INT AUTO_INCREMENT PRIMARY KEY,
                                   nome VARCHAR(50),
                                   email VARCHAR(100),
                                   stato VARCHAR(20) DEFAULT 'attivo'
);

//30. Vincoli combinati

CREATE TABLE prenotazioni (
                              id_prenotazione INT AUTO_INCREMENT PRIMARY KEY,
                              nome_cliente VARCHAR(100) NOT NULL,
                              numero_persone INT NOT NULL,
                              stato VARCHAR(20) DEFAULT 'confermata',
                              prezzo DECIMAL(10,2) NOT NULL,

                              CONSTRAINT check_persone CHECK (numero_persone > 0),
                              CONSTRAINT check_prezzo CHECK (prezzo >= 0)
);