//3. Articoli di un autore specifico

SELECT
    a.titolo,
    a.data_pubblicazione
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id
WHERE u.nome = 'Ada Lovelace';

//4. Articoli Pubblicati Dopo una Data

SELECT
    a.titolo,
    a.data_pubblicazione,
    u.nome
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id
WHERE a.data_pubblicazione >= '2024-01-01'
ORDER BY u.nome ASC;

//5. Articoli di Autori con Dominio Specifico

SELECT
    a.titolo,
    u.nome,
    u.email
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id
WHERE u.email LIKE '%@example.com';

//6. Filtrare con Condizioni Multiple

SELECT
    a.titolo,
    a.data_pubblicazione,
    u.nome
FROM articoli AS a
         INNER JOIN autori AS u
                    ON a.autore_fk = u.autore_id
WHERE u.nome LIKE 'A%'
  AND a.data_pubblicazione >= '2023-01-01'
ORDER BY a.data_pubblicazione ASC;