use misionesNinja;

insert into ninja(name, rango, aldea) values ("Naruto","Shunin","Konoha");
insert into ninja(name, rango, aldea) values ("Sasuke","Shunin","Konoha");
insert into ninja(name, rango, aldea) values ("RockLee","Shunin","Konoha");

insert into mision(description, rango, recompensa) values ("Recoger un gato","Shunin",10.2);
insert into mision(description, rango, recompensa) values ("Escolta","Sennin",20.2);

insert into habilidad(id_ninja, name, description) values (1,"rasengan","Comprime el chakra y le da vueltas");
insert into habilidad(id_ninja, name, description) values (2,"chidori","elemento rayo, derivacion rasengan");
insert into habilidad(id_ninja, name, description) values (4,"LotoEscondido","Habre la tercera puerta");

insert into misionNinja(id_ninja, id_mision, fechaInicio,fechaFin) values (1,2,"1995-12-13","1996-10-13");
insert into misionNinja(id_ninja, id_mision, fechaInicio,fechaFin) values (4,1,"1995-12-13","1996-10-13");
