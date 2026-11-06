//16. Stato di attività autore

SELECT
    u.nome,
    CASE
        WHEN COUNT(a.articolo_id) > THEN 'Attivo'
        ELSE 'Inattivo'
    END AS stato
FROM autori u
LEFT JOIN articoli a
    ON u.autore_id = a.autore_fk
GROUP BY u.autore_id, u.nome;

//17. Conteggio articoli per autore

SELECT
    u.nome,
    COUNT(a.articolo_id) AS numero_articoli
FROM autori u
LEFT JOIN articoli a
    ON u.autore_id = a.autore_fk
GROUP BY u.autore_id, u.nome;

//18. Etichetta di produttività

SELECT
    u.nome,
    COUNT(a.articolo_id) AS numero_articoli,
    CASE
        WHEN COUNT(a.articolo_id) > 3 THEN 'Profilico'
        WHEN COUNT(a.articolo_id) BETWEEN 1 AND 3 THEN 'Attivo'
        ELSE 'Inattivo'
    END AS categoria_attivita
FROM autori u
LEFT JOIN articoli a
    ON u.autore_id = a.autore_fk
GROUP BY u.autore_id, u.nome;



