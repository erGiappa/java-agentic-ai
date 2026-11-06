//16. Selezione di tutte le colonne

-- Visualizza tutte le colonne e tutti gli articoli
SELECT *
FROM articoli;

-- Visualizza solo le colonne richieste
SELECT titolo, data_pubblicazione, autore_fk
FROM articoli;

//17. Selezione filtrata

SELECT *
FROM articoli
WHERE autore_fk = 2
ORDER BY data_pubblicazione DESC;

//18. Selezione con più condizioni

SELECT *
FROM articoli
WHERE data_pubblicazione > '2022-12-31'
AND autore_fk = 1;

//19. Selezione con OR

SELECT *
FROM autori
WHERE nome = 'Ada Lovelace'
   OR nome = 'Alan Turing'
ORDER BY nome ASC;

//20. Selezione con IN

SELECT *
FROM articoli
WHERE autore_fk IN (1, 3, 5)
ORDER BY autore_fk ASC, data_pubblicazione ASC;

//21. Selezione con BETWEEN

SELECT titolo, data_pubblicazione
FROM articoli
WHERE data_pubblicazione BETWEEN '2023-01-01' AND '2023-12-31';

//22. Selezione con LIKE

SELECT *
FROM articoli
WHERE titolo LIKE '%SQL%';

//23. Selezione con NOT

SELECT *
FROM autori
WHERE nome NOT LIKE 'A%';