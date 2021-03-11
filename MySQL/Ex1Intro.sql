create database dt_loja;

use dt_loja;

create table tb_estoque(
id int auto_increment,
nome varchar(30) not null,
valor bigint(10) not null,
cor varchar(10) not null,
ativo boolean,
primary key(id)
);

insert into tb_estoque(nome, valor, cor, ativo) values ("TV",1000,"preta",true);
insert into tb_estoque(nome, valor, cor, ativo) values ("Geladeira", 2300,"prata",true);
insert into tb_estoque(nome, valor, cor, ativo) values ("Videogame", 3000,"brando",false);
insert into tb_estoque(nome, valor, cor, ativo) values ("Impressora", 500,"preta",true);
insert into tb_estoque(nome, valor, cor, ativo) values ("fogão",330,"prata",false);
insert into tb_estoque(nome, valor, cor, ativo) values ("Máquina de lavar",1100,"branca",true);
insert into tb_estoque(nome, valor, cor, ativo) values ("Cafeteira",260,"vermelha",true);
insert into tb_estoque(nome, valor, cor, ativo) values ("Microondas",400,"branco",false);

select * from tb_estoque where valor > 500;

select * from tb_estoque where valor < 500;

update tb_estoque set cor="branco" where id=3;

update tb_estoque set nome="Fogão" where id=5;

select * from tb_estoque