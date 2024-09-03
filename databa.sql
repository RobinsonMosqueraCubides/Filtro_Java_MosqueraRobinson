create database misionesNinja;
use misionesNinja;

create table ninja(
id int auto_increment primary key,
name varchar(50),
rango varchar(20),
aldea varchar(30)
);

create table mision(
id int auto_increment primary key,
description text,
rango varchar(20),
recompensa double(10,2)
);

create table misionNinja(
id_ninja int,
id_mision int,
fechaInicio date,
fechaFin date,
foreign key (id_ninja) references ninja (id),
foreign key (id_mision) references mision (id)
);

create table habilidad(
id_ninja int,
name varchar(50),
description text,
foreign key (id_ninja) references ninja(id)
);
