


CREATE TABLE user
(
    id    BIGINT AUTO_INCREMENT NOT NULL,
    nome  VARCHAR(255) NULL,
    idade INT NULL,
    CONSTRAINT pk_user PRIMARY KEY (id)
);

insert into user (nome, idade) values
("Lucia", 45),
("Ana", 20),
("Pedro", 21),
("Paulo", 25),
("Mariana", 30),
("Carla", 35),
("Juliana", 40);