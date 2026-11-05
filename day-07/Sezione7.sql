//31. Aggiungere una colonna

ALTER TABLE studenti
    ADD COLUMN telefono VARCHAR(20);

//32. Rimuovere una colonna

ALTER TABLE studenti
DROP COLUMN telefono;

//33. Aggiungere un vincolo dopo la creazione

ALTER TABLE prodotti
    ADD CONSTRAINT fk_categoria
        FOREIGN KEY (id_categoria)
            REFERENCES categorie(id_categoria);

//34. Rimuovere un vincolo

ALTER TABLE prodotti
DROP FOREIGN KEY fk_categoria;

//35. Rinominare una tabella

RENAME TABLE clienti TO persone;