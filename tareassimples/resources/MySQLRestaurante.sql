
-- El objetivo de esta tarea es que diseñes un modelo entidad-relación (ER) que permita gestionar de manera eficiente las reservas, 
-- pedidos y productos de un restaurante. 
-- Deberás identificar las entidades clave, sus atributos, las relaciones entre ellas y las cardinalidades.  
-- Requisitos: El modelo debe incluir al menos las siguientes entidades y relaciones:  
-- * Cliente: Puede realizar varias reservas.  
-- * Reserva: Relacionada con una o más mesas.  
-- * Mesa: Tiene una capacidad determinada y puede ser asignada a una reserva.  
-- * Pedido: Relacionado con uno o más productos y puede ser realizado por un cliente. 
-- * Producto: Incluye la información del nombre y precio, y puede formar parte de varios pedidos.  

CREATE DATABASE RESTAURANTE;

USE RESTAURANTE;

CREATE TABLE CLIENTES (
    ID_cliente INT AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Apellidos VARCHAR(50),
    Email VARCHAR(100) UNIQUE,
    Num_telefono VARCHAR(20),
    PRIMARY KEY (ID_cliente)
);

CREATE TABLE RESERVAS (
    ID_reserva INT AUTO_INCREMENT,
    ID_cliente INT,
    Fecha DATE, 
    Hora TIME,
    Estado VARCHAR(15),
    PRIMARY KEY (ID_reserva),
    FOREIGN KEY (ID_cliente) REFERENCES CLIENTES (ID_cliente)
);

CREATE TABLE MESAS (
    Num_mesa INT AUTO_INCREMENT,
    Capacidad_maxima INT,
    ID_reserva INT,
    PRIMARY KEY (Num_mesa),
    FOREIGN KEY (ID_reserva) REFERENCES RESERVAS (ID_reserva)
);

CREATE TABLE PEDIDOS (
    ID_pedido INT AUTO_INCREMENT,
    ID_cliente INT,
    Precio DECIMAL(10,2),
    PRIMARY KEY (ID_pedido),
    FOREIGN KEY (ID_cliente) REFERENCES CLIENTES (ID_cliente)
);

CREATE TABLE PRODUCTOS (
    ID_producto INT AUTO_INCREMENT,
    Nombre VARCHAR(50),
    Precio DECIMAL(10,2),
    PRIMARY KEY (ID_producto)
);

CREATE TABLE PEDIDOS_PRODUCTOS (
    ID_detalle_pedido INT AUTO_INCREMENT,
    ID_pedido INT, 
    ID_producto INT,
    Cantidad INT,
    Precio DECIMAL(10,2),
    PRIMARY KEY (ID_detalle_pedido),
    FOREIGN KEY (ID_pedido) REFERENCES PEDIDOS (ID_pedido),
    FOREIGN KEY (ID_producto) REFERENCES PRODUCTOS (ID_producto)
);

INSERT INTO CLIENTES (Nombre, Apellidos, Email, Num_telefono) 
VALUES ('Jose Manuel', 'Redondo Conde', 'manureco.97@gmail.com', '621626162');

INSERT INTO RESERVAS (ID_cliente, Fecha, Hora, Estado) 
VALUES (1, '2024-11-01', '19:00:00', 'Confirmado');

INSERT INTO MESAS (Num_mesa, Capacidad_maxima, ID_reserva) 
VALUES (1, 4, 1);

INSERT INTO PRODUCTOS (Nombre, Precio) 
VALUES ('Pizza 4 Quesos', 8.99);

INSERT INTO PEDIDOS (ID_cliente, Precio) 
VALUES (1, 8.99);

INSERT INTO PEDIDOS_PRODUCTOS (ID_pedido, ID_producto, Cantidad, Precio) 
VALUES (1, 1, 1, 8.99);
