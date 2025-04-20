package com.example.repositories;

import com.example.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    // Este repositorio hereda de JpaRepository, lo que proporciona métodos CRUD básicos para la entidad Contacto
    // Aquí puedes agregar métodos personalizados si es necesario

}
