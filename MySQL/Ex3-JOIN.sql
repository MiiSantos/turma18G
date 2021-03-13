create database db_estoque;

use db_farmacia_do_bem;

create table tb_categoria(
	id bigint(5) auto_increment,
	marca varchar(20) not null,
	ativo boolean,
    primary key(id)
);

insert into tb_categoria(marca, ativo) values ("biolab", true);
insert into tb_categoria(marca, ativo) values ("la-roche", true);
insert into tb_categoria(marca, ativo) values ("medley", true);
insert into tb_categoria(marca, ativo) values ("sanofi", true);
insert into tb_categoria(marca, ativo) values ("cimed", true);

create table tb_produtos(
	id int auto_increment,
    nome varchar(30) not null,
    preco decimal(10,2) not null,
    marca_id bigint not null,
    primary key (id),
    foreign key (marca_id) references tb_categoria (id)
);

select*from tb_produtos;
insert into tb_produtos(nome, preco, marca_id) values ("dorflex ", 14.90, 3);
insert into tb_produtos(nome, preco, marca_id) values ("alegra ", 43.50, 3);
insert into tb_produtos(nome, preco, marca_id) values ("Protetor solar", 83.90, 2);
insert into tb_produtos(nome, preco, marca_id) values ("Ibuprofeno", 5.70, 2);
insert into tb_produtos(nome, preco, marca_id) values ("sabonete esfoliante", 9.43, 1);
insert into tb_produtos(nome, preco, marca_id) values ("sabonete liquido", 23.98, 5);
insert into tb_produtos(nome, preco, marca_id) values ("agua termal", 64.60, 2);
insert into tb_produtos(nome, preco, marca_id) values ("omeprazol", 15.55, 3);

select * from tb_produtos where preco > 50;
select * from tb_produtos where preco > 3 and preco < 60;
select * from tb_produtos where nome Like "%b%";
select tb_produtos.nome, tb_produtos.preco, tb_categoria.marca 
from tb_produtos inner join tb_categoria on tb_produtos.marca_id = tb_categoria.id;
