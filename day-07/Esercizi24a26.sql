//24. Ordinamento crescente

SELECT *
FROM autori
ORDER BY nome ASC;

//25. Ordinamento decrescente

SELECT *
FROM articoli
ORDER BY data_pubblicazione DESC;

//26. Ordinamento multiplo

SELECT *
FROM articoli
ORDER BY autore_fk ASC, data_pubblicazione DESC;