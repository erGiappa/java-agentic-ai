//7. INNER JOIN con Ordinamento Complesso

SELECT
    a.titolo,
    u.nome,
    a.data_pubblicazione
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id
ORDER BY u.nome ASC, a.data_pubblicazione DESC;

//8. INNER JOIN con Selezione di Attributi

SELECT
    a.articolo_id,
    a.titolo,
    u.nome,
    u.email
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id
ORDER BY a.articolo_id ASC;

//9. INNER JOIN con Filtraggio Numerico

SELECT
    a.titolo,
    a.data_pubblicazione,
    u.nome
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id
WHERE a.articolo_id > 5;