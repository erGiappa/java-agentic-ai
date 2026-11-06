//28. Raggruppamento per Anno

SELECT
    YEAR(data_pubblicazione) AS anno,
    COUNT(articolo_id) AS numero_articoli
FROM articoli
GROUP BY YEAR(data_pubblicazione)
ORDER BY anno ASC;

//29. Raggruppamento per Anno e Autore

SELECT
    u.nome,
    YEAR(a.data_pubblicazione) AS anno,
    COUNT(a.articolo_id) AS numero_articoli
FROM autori u
    JOIN articoli a ON u.autore_id = a.autore_id
GROUP BY u.autore_id, u.nome, YEAR(a.data_pubblicazione)
ORDER BY anno ASC, u.nome ASC;

//30. Autori con Etichetta di Produzione

SELECT
    u.nome,
    COUNT(a.articolo_id) AS numero_articoli,
    CASE
        WHEN COUNT(a.articolo_id) > 5 THEN 'Molto attivo'
        WHEN COUNT(a.articolo_id) BETWEEN 2 AND 5 THEN 'Medio'
        ELSE 'Poco attivo'
        END AS etichetta_produzione
FROM autori u
         LEFT JOIN articoli a ON u.autore_id = a.autore_id
GROUP BY u.autore_id, u.nome;