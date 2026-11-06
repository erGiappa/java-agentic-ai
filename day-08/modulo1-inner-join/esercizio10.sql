//10. Analisi Qualitativa con CASE WHEN

SELECT
    a.titolo,
    a.data_pubblicazione,
    u.nome,
    CASE
        WHEN a.data_pubblicazione >= '2024-01-01' THEN 'Recente'
        ELSE 'Vecchio'
        END AS classificazione
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id;