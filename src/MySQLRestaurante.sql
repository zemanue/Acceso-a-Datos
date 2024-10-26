

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
    ID_cliente VARCHAR(50),
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
