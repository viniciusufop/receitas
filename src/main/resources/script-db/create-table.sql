CREATE TABLE receita (
	id SERIAL PRIMARY KEY,
  descricao varchar(250) NOT NULL,
  vencimento timestamp NOT NULL,
  valor decimal(10,2) NOT NULL
);