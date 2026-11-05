//6. Creazione di una tabella base

CREATE TABLE studenti (
                          studenti_id INT PRIMARY KEY,
                          nome VARCHAR(50),
                          email VARCHAR(100)
);

//7. Imporre la non nullità

ALTER TABLE studenti
    MODIFY nome VARCHAR(50) NOT NULL;

ALTER TABLE studenti
    MODIFY nome VARCHAR(100) NOT NULL;

//8. Vincolo UNIQUE

ALTER TABLE studenti
    ADD CONSTRAINT unique_email UNIQUE (email);

//9. Tipi di dati appropiati

CREATE TABLE prodotti (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          nome VARCHAR(100) NOT NULL,
                          prezzo DECIMAL(10,2) NOT NULL,
                          descrizione TEXT
);

//10. Valori di default

CREATE TABLE ordini (
                        ordini_id INT PRIMARY KEY AUTO_INCREMENT,
                        data_ordine DATETIME DEFAULT CURRENT_TIMESTAMP
);