//1. Elenco Articoli con Autori

SELECT
    articoli.titolo,
    articoli.data_pubblicazione,
    autori.nome
FROM articoli
         INNER JOIN autori
                    ON articoli.autore_fk = autori.autore_id
ORDER BY articoli.data_pubblicazione DESC;

//2. Uso degli alias

SELECT
    a.titolo,
    u.nome,
    u.email
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id
ORDER BY u.nome ASC;

