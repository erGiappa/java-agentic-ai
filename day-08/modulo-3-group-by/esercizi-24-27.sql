//24. Aggregazione con JOIN

SELECT
    u.nome,
    COUNT(a.articolo_id) AS numero_articoli
FROM autori u
JOIN articoli a ON u.autore_id = a.autore_id
GROUP BY u.autore_id, u.nome
ORDER BY numero_articoli DESC;

//25. Media lunghezza titoli

SELECT
    u.nome,
    AVG(LENGTH(a.titolo)) AS media_lunghezza_titoli
FROM autori u
JOIN articoli a ON u.autore_id = autore_id
GROUP BY u.autore_id, u.nome;

//26. Filtraggio con HAVING

SELECT
    u.nome,
    COUNT(a.articolo_id) AS numero_articoli
FROM autori u
         JOIN articoli a ON u.autore_id = a.autore_id
GROUP BY u.autore_id, u.nome
HAVING COUNT(a.articolo_id) >= 2;

//27. Date di Pubblicazione per Autore

SELECT
    u.nome,
    MIN(a.data_pubblicazione) AS primo_articolo,
    MAX(a.data_pubblicazione) AS ultimo_articolo,
    COUNT(a.articolo_id) AS numero_totale
FROM autori u
         JOIN articoli a ON u.autore_id = a.autore_id
GROUP BY u.autore_id, u.nome;
