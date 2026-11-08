//37. Filtro combinato complesso

SELECT *
FROM articoli
WHERE autore_fk IN (2, 3, 4)
    AND YEAR(data_pubblicazione) > 2023
ORDER BY autore_fk ASC, data_pubblicazione DESC;

38. Uso di condizioni multiple OR e AND

SELECT *
FROM articoli
WHERE (
          titolo LIKE '%SQL%'
              OR titolo LIKE '%Java%'
          )
    AND YEAR(data_pubblicazione) > 2022;