attach database ":memory:" as nuevo;
detach database nuevo;
analyze main.tabla;
analyze main;
analyze tabla;
begin exclusive transaction y1;
COMMIT transaction y1;
end;
SAVEPOINT tom;
rollback;
rollback transaction;
rollback transaction to tom;
rollback to tom;
rollback transaction to savepoint tom;
release savepoint tom;
drop index if exists main.indice;
create index indice on tabla(c1 collate colacion asc, c2 desc, c3 collate colar, c4 asc, c5, c6);
DROP TABLE tabla;
DROP VIEW if exists main.vista;
reindex main.indice;
rEindEx;
vacuum;
SELECT * , tom.* from table where main.second."holi" = null || raise(rollback, "no se puede");
select * from tabla intersect select c1, c2 from tabla2;
DELETE FROM tom.tabla NOT INDEXED WHERE id = 1;
insert into tabla(c1, c2, c3) values(3, 4.5, "interesante");
CREATE TRIGGER Language_en_US_update INSTEAD OF UPDATE ON Language_en_US BEGIN UPDATE LocalizedText SET Text = NEW.Text , Gender = NEW.Gender, Plurality = NEW.Plurality WHERE Language = 'en_US' and Tag = NEW.Tag; END;
insert into co.tabla(c1, c2, c3) values(3, 4.5, "interesante"),(1,2.1,"no");
create table tabla(
a integer primary key not null default 10,
b text not null,
c real
);