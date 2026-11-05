//21. Tipi numerici

CREATE TABLE magazzino (
                           quantita INT,
                           peso DECIMAL(6,2),
                           codice BIGINT
);

22. Tipi stringa

CREATE TABLE utenti (
                        nome VARCHAR(50),
                        descrizione TEXT
);

//23. Tipi data e ora

CREATE TABLE eventi (
                        data_evento DATE,
                        ora_inizio TIME
);

//24. Timestamp automatico

CREATE TABLE log_accessi (
                             id INT AUTO_INCREMENT PRIMARY KEY,
                             timestamp_evento TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

//25. Tipi di dato misti

CREATE TABLE fatture (
                         id_fattura INT AUTO_INCREMENT PRIMARY KEY,
                         numero_fattura VARCHAR(20) NOT NULL,
                         importo DECIMAL(10,2) NOT NULL,
                         data_fattura DATE NOT NULL,
                         descrizione TEXT
);