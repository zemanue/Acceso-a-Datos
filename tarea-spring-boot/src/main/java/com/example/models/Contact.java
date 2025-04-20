package com.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "contactos")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private int telefono;
    private String email;
    private String direccion;


    public Contact() {
    }

    public Contact(String nombre, int telefono, String email, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }
}
