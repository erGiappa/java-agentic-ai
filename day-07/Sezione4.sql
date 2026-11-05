//16. Relazione uno-a-molti

CREATE TABLE categorie (
                           id_categoria INT AUTO_INCREMENT PRIMARY KEY,
                           nome_categoria VARCHAR(100) NOT NULL
);

CREATE TABLE prodotti (
                          id_prodotto INT AUTO_INCREMENT PRIMARY KEY,
                          nome VARCHAR(100) NOT NULL,
                          prezzo DECIMAL(10,2),
                          id_categoria INT,

                          FOREIGN KEY (id_categoria)
                              REFERENCES categorie(id_categoria)
);


//17. Inserimento incoerente

INSERT INTO prodotti (nome, prezzo, id_categoria)
VALUES ('Mouse', 25.90, 99);

//Genera errore

//19. Cancellazione vietata (ON DELETE RESTRICT)

ALTER TABLE prodotti
DROP FOREIGN KEY prodotti_ibfk_1;

ALTER TABLE prodotti
    ADD CONSTRAINT fk_categoria
        FOREIGN KEY (id_categoria)
            REFERENCES categorie(id_categoria)
            ON DELETE RESTRICT;

//20. Cancellazione a cascata (ON DELETE CASCADE)

ALTER TABLE prodotti
DROP FOREIGN KEY fk_categoria;

ALTER TABLE prodotti
    ADD CONSTRAINT fk_categoria
        FOREIGN KEY (id_categoria)
            REFERENCES categorie(id_categoria)
            ON DELETE CASCADE;