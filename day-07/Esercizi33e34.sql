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

//Analisi di valori NULL

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