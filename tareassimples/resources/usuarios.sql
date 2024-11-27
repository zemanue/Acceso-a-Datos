CREATE DATABASE usuarios;

USE usuarios;

CREATE TABLE usuarios (
id INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
apellido VARCHAR(50) NOT NULL,
edad INT,
correo VARCHAR(100) UNIQUE NOT NULL
);

INSERT INTO usuarios (nombre, apellido, edad, correo) VALUES (
    'Ines', 
    'Duque Campos',
    24, 
    'inesducamp@gmail.com'
    );
INSERT INTO usuarios (nombre, apellido, edad, correo) VALUES (
    'Manuel', 
    'Fuentes Delgado', 
    21, 
    'manufuentes99@gmail.com'
    );
INSERT INTO usuarios (nombre, apellido, edad, correo) VALUES (
    'Ahmed',
    'Said', 
    30, 
    'ahmedsaid@gmail.com'
    );
INSERT INTO usuarios (nombre, apellido, edad, correo) VALUES (
    'Veronica',
    'Hernandez Puebla',
    37, 
    'verohdez.30@gmail.com'
    );