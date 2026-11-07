//27. Selezione con operatori di confronto

SELECT *
FROM articoli
WHERE articoli_id > 5;

SELECT *
FROM articoli
WHERE articolo_id <= 5;

//28. Combinazione di operatori

SELECT *
FROM articoli
WHERE articolo_id > 2
AND titolo LIKE '%JAVA%';

//29. Verifica della consistenza dei dati

SELECT *
FROM articoli
WHERE autore_fk NOT IN (
    SELECT autore_id
    FROM autori
    );

-- Questa query individua gli articoli che hanno un autore_fk
-- senza una corrispondenza nella tabella autori.
-- Se è presente un vincolo FOREIGN KEY tra autore_fk e autore_id,
-- il database impedisce l'inserimento o la modifica di un articolo
-- con un autore inesistente, garantendo l'integrità referenziale.