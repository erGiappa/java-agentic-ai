//11 Tutti gli esercizi e i loro articoli

SELECT
    u.nome,
    a.titolo
FROM autori u
LEFT JOIN articoli a
ON u.autore_id = a.autore_fk
ORDER BY u.nome;

//12 Autori senza articoli

SELECT
    u.nome
FROM autori u
LEFT JOIN articoli u
ON u.autore_id = a.autore_fk
WHERE a.articolo_id IS NULL;

//13 Left join con ordinamento

select
    u.nome,
    a.titolo
FROM autori u
LEFT JOIN articoli a
ON u.autore_id = a.autore_fk
ORDER BY u.nome, a.data_pubblicazione;

//14 Left join con filtro su tabella destra

select
    u.nome,
    a.titolo
from autori u
left join articoli a
on u.autore_id = a.autore_fk
and a.data_pubblicazione >= '2024-01-01'
order by u.nome;

//15 Verifica di articoli orfani

select
    a.articolo_id,
    a.titolo,
    a.autore_fk
from articoli a
left join autori u
on a.autore_fk = u.autore_id
where u.nome is null;

