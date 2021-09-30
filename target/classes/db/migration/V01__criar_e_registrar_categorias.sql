CREATE TABLE categoria (
codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO categoria (nome) VALUES ('Informatica');
INSERT INTO categoria (nome) VALUES ('Teste-QA');
INSERT INTO categoria (nome) VALUES ('Teste-QA - Manutenção');
INSERT INTO categoria (nome) VALUES ('Back-End');
INSERT INTO categoria (nome) VALUES ('Back-End - Manutenção');
INSERT INTO categoria (nome) VALUES ('Front-End');
INSERT INTO categoria (nome) VALUES ('Front-End - Manutenção');