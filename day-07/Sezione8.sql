//36. Schema "Blog": autori (autore_id PK, nome, email UNIQUE), articoli (articolo_id PK, titolo, contenuto, data_pubblicazione DATETIME DEFAULT CURRENT_TIMESTAMP, autore_fk FK → autori)

CREATE TABLE autori (
                        autore_id INT AUTO_INCREMENT PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL,
                        email VARCHAR(100) UNIQUE
);

CREATE TABLE articoli (
                          articolo_id INT AUTO_INCREMENT PRIMARY KEY,
                          titolo VARCHAR(200) NOT NULL,
                          contenuto TEXT,
                          data_pubblicazione DATETIME DEFAULT CURRENT_TIMESTAMP,
                          autore_fk INT,

                          CONSTRAINT fk_articoli_autori
                              FOREIGN KEY (autore_fk)
                                  REFERENCES autori(autore_id)
);

//37. Schema università: studenti, corsi, docenti e iscrizioni

CREATE TABLE studenti (
                          studente_id INT AUTO_INCREMENT PRIMARY KEY,
                          nome VARCHAR(50) NOT NULL,
                          cognome VARCHAR(50) NOT NULL,
                          email VARCHAR(100) UNIQUE
);

CREATE TABLE docenti (
                         docente_id INT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(50) NOT NULL,
                         cognome VARCHAR(50) NOT NULL,
                         email VARCHAR(100) UNIQUE
);

CREATE TABLE corsi (
                       corso_id INT AUTO_INCREMENT PRIMARY KEY,
                       nome_corso VARCHAR(100) NOT NULL,
                       docente_fk INT NOT NULL,

                       FOREIGN KEY (docente_fk)
                           REFERENCES docenti(docente_id)
);

CREATE TABLE iscrizioni (
                            studente_fk INT,
                            corso_fk INT,
                            data_iscrizione DATE DEFAULT (CURRENT_DATE),

                            PRIMARY KEY (studente_fk, corso_fk),

                            FOREIGN KEY (studente_fk)
                                REFERENCES studenti(studente_id),

                            FOREIGN KEY (corso_fk)
                                REFERENCES corsi(corso_id)
);

//38. Schema biblioteca: autori, libri e prestiti

CREATE TABLE autori (
                        autore_id INT AUTO_INCREMENT PRIMARY KEY,
                        nome VARCHAR(100) NOT NULL,
                        cognome VARCHAR(100) NOT NULL
);

CREATE TABLE libri (
                       libro_id INT AUTO_INCREMENT PRIMARY KEY,
                       titolo VARCHAR(200) NOT NULL,
                       anno_pubblicazione INT,
                       autore_fk INT NOT NULL,

                       FOREIGN KEY (autore_fk)
                           REFERENCES autori(autore_id)
);

CREATE TABLE prestiti (
                          prestito_id INT AUTO_INCREMENT PRIMARY KEY,
                          libro_fk INT NOT NULL,
                          nome_utente VARCHAR(100) NOT NULL,
                          data_prestito DATE DEFAULT (CURRENT_DATE),
                          data_restituzione DATE,

                          FOREIGN KEY (libro_fk)
                              REFERENCES libri(libro_id)
);

//39 Schema "Negozio online": clienti, ordini, prodotti, dettagli_ordine

CREATE TABLE clienti (
                         cliente_id INT AUTO_INCREMENT PRIMARY KEY,
                         nome VARCHAR(100) NOT NULL,
                         email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE prodotti (
                          prodotto_id INT AUTO_INCREMENT PRIMARY KEY,
                          nome VARCHAR(100) NOT NULL,
                          prezzo DECIMAL(10,2) NOT NULL
);

CREATE TABLE ordini (
                        ordine_id INT AUTO_INCREMENT PRIMARY KEY,
                        cliente_fk INT NOT NULL,
                        data_ordine DATETIME DEFAULT CURRENT_TIMESTAMP,

                        FOREIGN KEY (cliente_fk)
                            REFERENCES clienti(cliente_id)
);

CREATE TABLE dettagli_ordine (
                                 ordine_fk INT,
                                 prodotto_fk INT,
                                 quantita INT NOT NULL,
                                 prezzo_unitario DECIMAL(10,2) NOT NULL,

                                 PRIMARY KEY (ordine_fk, prodotto_fk),

                                 FOREIGN KEY (ordine_fk)
                                     REFERENCES ordini(ordine_id),

                                 FOREIGN KEY (prodotto_fk)
                                     REFERENCES prodotti(prodotto_id),

                                 CHECK (quantita > 0),
                                 CHECK (prezzo_unitario >= 0)
);

