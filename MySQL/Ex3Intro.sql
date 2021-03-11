create database dt_escola;

use dt_escola;

create table tb_alunos(
id int auto_increment,
nome varchar(30) not null,
idade int(2) not null,
professor varchar(30) not null,
media int,
primary key(id)
);

insert into tb_alunos(nome, idade, professor, media) values ("Ana", 12, "Juliana", 7);
insert into tb_alunos(nome, idade, professor, media) values ("João", 11, "Rafaela", 8);
insert into tb_alunos(nome, idade, professor, media) values ("Pedro", 14, "Roberto", 6);
insert into tb_alunos(nome, idade, professor, media) values ("Maria", 11, "Rafaela", 8);
insert into tb_alunos(nome, idade, professor, media) values ("Yuri", 12, "Juliana", 6);
insert into tb_alunos(nome, idade, professor, media) values ("Luana", 14, "Roberto", 7);
insert into tb_alunos(nome, idade, professor, media) values ("Pietra", 13, "Joaquim", 9);
insert into tb_alunos(nome, idade, professor, media) values ("Rafael", 13, "Joaquim", 8);

select * from tb_alunos where media > 7;

select * from tb_alunos where media < 7;

update tb_alunos set media = 10 where id = 7 ;

select * from tb_alunos

