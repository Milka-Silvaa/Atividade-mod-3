-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.

CREATE DATABASE TEMVAGAA;
USE TEMVAGAA;

CREATE TABLE PASSAGEM (
PROMOÇÃO DOUBLE(9,5),
CODIGO_PASSAGEM INTEGER PRIMARY KEY auto_increment,
VALOR_VIAGEM DOUBLE(5,2),
DATA DATE,
CODIGO_DESTINO INTEGER,
CPF int(15)
);

CREATE TABLE CLIENTE (
NOME VARCHAR(50),
IDADE VARCHAR(50),
TELEFONE VARCHAR(50),
EMAIL VARCHAR(50),
CPF int(50) PRIMARY KEY,
DATA_NASCIMENTO double,
NUMERO VARCHAR(20),
ESTADO VARCHAR(50),
CEP VARCHAR(50),
BAIRRO VARCHAR(50),
PAIS VARCHAR(50),
ENDEREÇO VARCHAR(50)
)
;
CREATE TABLE DESTINO (
CODIGO_DESTINO INTEGER PRIMARY KEY auto_increment,
ESTADO VARCHAR(50),
CIDADE VARCHAR(50)
);

ALTER TABLE PASSAGEM ADD FOREIGN KEY(CODIGO_DESTINO) REFERENCES DESTINO (CODIGO_DESTINO);
ALTER TABLE PASSAGEM ADD FOREIGN KEY(CPF) REFERENCES CLIENTE (CPF);

SELECT*FROM CLIENTE;
SELECT*FROM DESTINO;
SELECT*FROM PASSAGEM;
INSERT INTO DESTINO (ESTADO,CIDADE) VALUES ('PERNAMBUCO', 'RECIFE');