create table article (
	id int not null auto_increment,
	libelle varchar(100) not null,
	prix decimal(10,2) not null,
	primary key (id)
);
insert into article(libelle,prix) values ('patate',0.5);
insert into article(libelle,prix) values ('chaussette',2.5);
