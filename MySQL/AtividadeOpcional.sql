create database db_minha_casa_mais_bonita;

use db_minha_casa_mais_bonita;

CREATE TABLE tb_categoria (
	id INT AUTO_INCREMENT,
	tipo varchar(20) NOT NULL,
    ativo boolean not null,
	PRIMARY KEY (id)
);

CREATE TABLE tb_produto (
	id INT AUTO_INCREMENT,
	nome varchar(20) NOT NULL,
	valor FLOAT NOT NULL,
    cor varchar(20) not null,
	produto_id int not null,
    primary key (id),
    foreign key (produto_id) references tb_categoria (id)
);

CREATE TABLE tb_usuario (
	id INT NOT NULL AUTO_INCREMENT,
	nome varchar(20) NOT NULL,
	genero varchar(10) not null,
	senha int NOT NULL,
	PRIMARY KEY (id)
);

insert into tb_categoria(tipo, ativo) values ("madeira", true);
insert into tb_categoria(tipo, ativo) values ("aluminio", true);
insert into tb_categoria(tipo, ativo) values ("ceramica", true);
insert into tb_categoria(tipo, ativo) values ("tecido", true);
insert into tb_categoria(tipo, ativo) values ("vidro", true);

insert into tb_produto(nome, valor, cor, produto_id) values ("armário", 800.00, "marrom", 1);
insert into tb_produto(nome, valor, cor, produto_id) values ("sofá", 1200, "estampado", 4);
insert into tb_produto(nome, valor, cor, produto_id) values ("mesa de centro", 150, "madeira e vidro", 5);
insert into tb_produto(nome, valor, cor, produto_id) values ("vaso decorativo", 40, "abstrato", 3);
insert into tb_produto(nome, valor, cor, produto_id) values ("porta retrato", 20, "prata", 2);
insert into tb_produto(nome, valor, cor, produto_id) values ("abajur", 60, "beje", 4);

insert into tb_usuario(nome, genero, senha) values ("João", "masculino", true);
insert into tb_usuario(nome, genero, senha) values ("Maria", "feminino", true);
insert into tb_usuario(nome, genero, senha) values ("Laura", "feminino", true);
insert into tb_usuario(nome, genero, senha) values ("Will", "masculino", true);

select * from tb_produto where valor > 50;
select * from tb_produto where valor > 6 and valor < 60;
select * from tb_produto where nome like "%b%";
select * from tb_produto where nome like "%c%";
select * from tb_produto inner join tb_categoria on tb_produto.produto_id = tb_categoria.id;
SELECT AVG(valor) FROM tb_produto;
SELECT sum(valor) FROM tb_produto;
SELECT COUNT(nome) FROM tb_produto;
select * from tb_produto where produto_id = 4;




