insert into cliente (id, nome) values (1, 'Tags Eletrônicos');
insert into cliente (id, nome) values (2, 'Smart Eletro');
insert into cliente (id, nome) values (3, 'informática norte e sul');


insert into produto (id, nome, valor) values (1, 'Notebook', 2650.0);
insert into produto (id, nome, valor) values (2, 'Smartphone', 1500.0);
insert into produto (id, nome, valor) values (3, 'Computador Dell', 3700.0);


insert into venda (id, cliente_id, frete, total, cadastro) values (1, 1, 15.0, 2665.0, sysdate());

insert into item (id, venda_id, produto_id, quantidade) values (1, 1, 1, 1);