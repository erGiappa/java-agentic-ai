//11. Chiave primaria surrogata

CREATE TABLE clienti (
                         cliente_id INT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(50),
                         cognome VARCHAR(50),
                         email VARCHAR(100)
);

//12. Chiave naturale

CREATE TABLE libri (
                       ISBN VARCHAR(13) PRIMARY KEY,
                       titolo VARCHAR(100),
                       autore VARCHAR(100),
                       anno_pubblicazione INT
);

//13. Chiave composta

CREATE TABLE iscrizioni (
                            studente_id INT,
                            corso_id INT,

                            PRIMARY KEY (studente_id, corso_id),

                            FOREIGN KEY (studente_id)
                                REFERENCES studenti(studente_id),

                            FOREIGN KEY (corso_id)
                                REFERENCES corsi(corso_id)
);

//15 Test di unicità

INSERT INTO clienti (cliente_id, nome, cognome, email)
VALUES (1, 'John Michael', 'Baticos', 'jmb@email.it');