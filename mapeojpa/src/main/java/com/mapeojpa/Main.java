/*
 * Ejercicio: Mapeo de Entidades utilizando JPA
1. Mapeo de Clases con JPA
    • Utilizar las anotaciones de JPA para mapear las clases Cliente y Pedido a entidades en la base de datos.
    • Anotaciones clave:
        o @Entity: Marca la clase como una entidad gestionada por JPA.
        o @Id: Define el atributo que será la clave primaria de la entidad.
        o @GeneratedValue: Indica que el valor de la clave primaria será generado automáticamente.
2. Relación Uno a Muchos (Cliente - Pedidos)
    • Establecer una relación de uno a muchos entre las entidades Cliente y Pedido.
    • Un cliente puede tener múltiples pedidos.
    • Usar la anotación @OneToMany en la clase Cliente.
3. Relación Muchos a Uno (Pedido - Cliente)
    • Establecer una relación de muchos a uno entre las entidades Pedido y Cliente.
    • Un pedido pertenece a un único cliente.
    • Usar las siguientes anotaciones en la clase Pedido:
        o @ManyToOne: Indica la relación de muchos a uno.
        @JoinColumn: Especifica la columna que actúa como clave externa en la tabla de pedidos,
        apuntando a la tabla de clientes.
4. Generación de Claves Primarias
    • Usar la anotación @GeneratedValue con la estrategia GenerationType.IDENTITY para que
    las claves primarias se generen automáticamente por la base de datos.
5. Cascada de Operaciones (Cliente - Pedidos)
    • Configurar la cascada de operaciones entre Cliente y Pedidos usando (cascade =
    CascadeType.ALL ) .Esto asegura que cualquier operación de persistencia (guardar,
    actualizar o eliminar) en un cliente se aplique también a sus pedidos asociados.
6. Proporcionar Getters y Setters
    • Asegurarse de que las clases Cliente y Pedido tengan métodos getter y setter para acceder
    y modificar sus atributos.
 */

package com.mapeojpa;

public class Main {
    public static void main(String[] args) {

    }
}