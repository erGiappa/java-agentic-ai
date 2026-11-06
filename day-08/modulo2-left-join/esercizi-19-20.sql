//19. Autori con articoli recenti

SELECT
    u.nome,
    COUNT(a.articolo_id) AS numero_articoli
FROM autori u
LEFT JOIN articoli a
ON u.autore_id = a.autore_fk
AND a.data_pubblicazione >= '2025-01-01'
GROUP BY u.autore_id, u.nome
HAVING COUNT(a.articolo_id) > 0;

//20. Report Completo Autori

SELECT
    u.nome AS nome_autore,
    COUNT(a.articolo_id) AS numero_articoli,
    MIN(a.data_pubblicazione) AS data_primo_articolo,
    MAX(a.data_pubblicazione) AS data_ultimo_articolo,
FROM autori u
LEFT JOIN articoli a
    ON u.autore_id = a.autore_fk
GROUP BY u.autore_id, u.nome
ORDER BY numero_articoli DESC;