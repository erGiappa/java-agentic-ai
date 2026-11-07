//31. Inserimento e selezione combinata

INSERT INTO autori (nome, cognome, email)
VALUES ('John', 'Michael', 'john.michael@email.com' );

SELECT *
FROM autori
WHERE email = 'john.michael@email.com';

//32. Inserimento multiplo e filtro con LIKE

INSERT INTO articoli (titolo, contenuto)
VALUES
('Guida SQL', 'Introduzione al linguaggio SQL.'),
('Guida JAVA', 'Esempi pratici di utilizzo di JAVA.'),
('Guida AI', 'Chiacchere sull AI.');

SELECT *
FROM articoli
WHERE titolo LIKE '%Guida%';