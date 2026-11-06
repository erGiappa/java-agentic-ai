//11. Eliminazione controllata

-- Verifica dell'esistenza dell'autore
SELECT *
FROM autori
WHERE autore_id = 4;

//12. Eliminazione multipla

DELETE FROM articoli
WHERE data_pubblicazione < '2023-01-01';

//13. Eliminazione per condizione testuale

DELETE FROM autori
WHERE email LIKE '%@test.com';

//15. Eliminazione selettiva tramite IN

DELETE FROM clienti
WHERE cliente_id IN (2, 3, 4);



