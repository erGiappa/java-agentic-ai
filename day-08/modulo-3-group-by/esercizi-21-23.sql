//21. Conteggio Totale

SELECT COUNT(*) AS totale_articoli
FROM articoli;

//22. Estremi Temporali

SELECT
    MIN(data_pubblicazione) AS data_piu_vecchia,
    MAX(data_pubblicazione) AS data_piu_recente
FROM articoli;

//23. Conteggio per Autore

SELECT
    autore_fk,
    COUNT(*) AS numero_articoli
FROM articoli
GROUP BY autore_fk;


