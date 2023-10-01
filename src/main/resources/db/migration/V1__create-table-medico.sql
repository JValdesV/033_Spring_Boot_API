CREATE TABLE medicos (
    id bigint AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL unique,
    documento VARCHAR(20) NOT NULL unique,
    especialidad VARCHAR(100) NOT NULL,
    calle VARCHAR(255) NOT NULL,
    distrito VARCHAR(100) NOT NULL,
    complemento VARCHAR(255),
    numero VARCHAR(20),
    ciudad VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
);