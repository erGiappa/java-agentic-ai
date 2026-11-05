//Inserimento di almeno tre autori

insert into autori (nome, email)
values
('john baticos', 'john@email.it'),
('michael baticos', 'michael@email.it'),
('john michael', 'baticos@email.it');

select * from autori;

//Inserimento di tre articoli associati agli autori

insert into articoli (titolo, contenuto, autore_fk)
values
('titolo1', 'contenuto1', 1),
('titolo2', 'contenuto2', 2),
('titolo3', 'contenuto3', 3);

select titolo, data_pubblicazione
from articoli;

//Inserimento errato e violazione dei vincoli

INSERT INTO articoli (contenuto, autore_fk)
VALUES ('no titolo', 1);

//Errore perché la colonna titolo è stata definita con il vincolo NOT NULL

//Inserimento implicito (senza indicare le colonne)

INSERT INTO autori
VALUES (NULL, 'jmb', 'jmb@email.it');

//Inserimento di un articolo con chiave esterna inesistente

INSERT INTO articoli (titolo, contenuto, autore_fk)
VALUES (
    'prova',
    'prova contenuto',
    10
);