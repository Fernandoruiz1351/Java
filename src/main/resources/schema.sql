CREATE TABLE cliente (
    id int autoincrement PRIMARY KEY,
    nombre varchar(150) NOT NULL,
    apellido varchar(150) NOT NULL,
    dni int NOT NULL
);

CREATE TABLE productos(
    id int autoincrement PRIMARY KEY,
    item varchar(150) NOT NULL,
    precio int NOT NULL,
);

CREATE TABLE ventas(
    id int autoincrement PRIMARY KEY,
    vendedor varchar(150) NOT NULL,
    cantvendidos int
)