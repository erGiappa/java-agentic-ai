//33. Cancellazione logica simulata

ALTER TABLE articoli
    ADD stato VARCHAR(20) DEFAULT 'pubblicato';

UPDATE articoli
SET stato = 'archiviato'
WHERE anno < 2023
  AND stato = 'pubblicato';

SELECT *
FROM articoli
WHERE stato = 'archiviato';

//34. Analisi di valori NULL

INSERT INTO articoli (titolo, contenuto, anno)
VALUES ('Articolo di prova', NULL, 2024);

SELECT *
FROM articoli
WHERE contenuto IS NULL;

UPDATE articoli
SET contenuto = 'Questo è un articolo di prova con contenuto descrittivo.'
WHERE titolo = 'Articolo di prova'
  AND contenuto IS NULL;

SELECT *
FROM articoli
WHERE titolo = 'Articolo di prova';

//35. Eliminazione e verifica finale

DELETE FROM articoli
WHERE titolo = 'Articolo di prova'
AND contenuto = 'Questo è un articolo di prova con contenuto descrittivo';

//36. Inserimento sequeziale coerente

INSERT INTO autori (nome, email)
VALUES ('Sanji Vinsmoke', 'blackleg@email.com')

INSERT INTO articoli (titolo, contenuto, autore_fk, data_pubblicazione)
VALUES (
    'Ricette Baratie',
    'Ricette del famoso chef Zeff',
    LAST_INSERT_ID(),
    '2024-05-10'
);

INSERT INTO articoli (titolo, contenuto, autore_fk, data_pubblicazione)
VALUES (
           'Come dare calci',
           'Le mani sono per cucinare quindi si usano i piedi',
           LAST_INSERT_ID() - 1,
           '2024-06-15'
       );