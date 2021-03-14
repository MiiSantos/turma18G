create database db_cidade_dos_legumes;

use db_cidade_dos_legumes;

create table tb_categoria(
id int auto_increment,
tipo varchar(20) not null,
primary key (id)
);

insert into tb_categoria(tipo) values("legumes");
insert into tb_categoria(tipo) values("frutas");
insert into tb_categoria(tipo) values("verduras");
insert into tb_categoria(tipo) values("grãos");

select*from tb_categoria;

create table tb_produto(
id int auto_increment,
nome varchar(10) not null,
valor float not null,
tipo_id int,
primary key (id),
foreign key (tipo_id) references tb_categoria(id)
);

insert into tb_produto(nome, valor, tipo_id) values ("morango", 15.70, 2);
insert into tb_produto(nome, valor, tipo_id) values ("alface", 3.00, 3);
insert into tb_produto(nome, valor, tipo_id) values ("lentilha", 8.59, 4);
insert into tb_produto(nome, valor, tipo_id) values ("pepino", 9.60, 1);
insert into tb_produto(nome, valor, tipo_id) values ("berinjela", 6.90, 1);
insert into tb_produto(nome, valor, tipo_id) values ("feijão", 12.30, 4);
insert into tb_produto(nome, valor, tipo_id) values ("laranja", 10.90, 2);
insert into tb_produto(nome, valor, tipo_id) values ("couve", 2.99, 3);

select * from tb_produto where valor > 50;
select * from tb_produto where valor > 3 and valor < 50;
select * from tb_produto where nome Like "%c%";
select tb_produto.nome, tb_produto.valor, tb_categoria.tipo 
from tb_produto inner join tb_categoria on tb_produto.tipo_id = tb_categoria.id;