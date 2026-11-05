//6. Aggiornamento di dati specifici

SET SQL_SAFE_UPDATES = 0;

UPDATE autori
SET email = 'jmbnew@email.com'
WHERE nome = 'jmb';

SELECT *
FROM autori
WHERE nome = 'jmb';

//7. Aggiornamento multiplo

SET SQL_SAFE_UPDATES = 0;

UPDATE articoli
SET
    titolo = 'titolo aggiornato2',
    contenuto = 'contenuto aggiornato2'
WHERE articolo_id = 2;

//8. Aggiornamento condizionale

UPDATE articoli
SET titolo = CONCAT(titolo, ' (Aggiornato)')
WHERE autore_fk = 1;

//9. Aggiornamento con filtro testuale

UPDATE autori
SET nome = CONCAT(nome, ' - Storico')
WHERE nome LIKE 'A%';

//10. Aggiornamento con intervallo

UPDATE prodotti
SET prezzo = prezzo * 1.10
WHERE id BETWEEN 5 AND 15;


