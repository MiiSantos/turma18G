create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id int auto_increment,
tipo varchar(10) not null,
tamanho varchar(10) not null,
primary key (id)
);

insert into tb_categoria(tipo, tamanho) values ("salgada", "grande");
insert into tb_categoria(tipo, tamanho) values ("salgada", "pequena");
insert into tb_categoria(tipo, tamanho) values ("doce", "grande");
insert into tb_categoria(tipo, tamanho) values ("doce", "pequena");
insert into tb_categoria(tipo, tamanho) values ("doce", "média");
insert into tb_categoria(tipo, tamanho) values ("salgada", "média");

create table tb_pizza(
id int auto_increment,
sabor varchar(20) not null,
preco float not null,
promocao boolean,
tipo_id int not null,
primary key (id),
foreign key (tipo_id) references tb_categoria (id)
);

insert into tb_pizza(sabor, preco, promocao, tipo_id) values ("calabresa", 39.00, true, 1);
insert into tb_pizza(sabor, preco, promocao, tipo_id) values ("cholate", 45.00, true, 3);
insert into tb_pizza(sabor, preco, promocao, tipo_id) values ("vegetariana", 20.00, false, 6);
insert into tb_pizza(sabor, preco, promocao, tipo_id) values ("marguerita", 35.00, true, 1);
insert into tb_pizza(sabor, preco, promocao, tipo_id) values ("nutella", 62.00, true, 3);
insert into tb_pizza(sabor, preco, promocao, tipo_id) values ("M&M's", 25.00, true, 4);
insert into tb_pizza(sabor, preco, promocao, tipo_id) values ("calabresa", 15.00, false, 2);

select * from tb_pizza where preco > 45;
select * from tb_pizza where preco > 29 and preco < 60;
select * from tb_pizza where sabor Like "%c%";
select tb_pizza.sabor, tb_categoria.tipo, tb_categoria.tamanho 
from tb_pizza inner join tb_categoria on tb_pizza.tipo_id = tb_categoria.id
where tb_categoria.tipo = "doce";