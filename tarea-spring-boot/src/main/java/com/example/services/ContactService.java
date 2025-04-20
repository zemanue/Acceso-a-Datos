package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Contact;
import com.example.repositories.ContactRepository;

// Esta clase es un servicio que interactúa con el repositorio de Contacto
// para realizar operaciones CRUD y otras lógicas de negocio relacionadas con Contacto.
@Service
public class ContactService {

    // Se inyecta el repositorio de Contacto para poder utilizar sus métodos.
    @Autowired
    private ContactRepository contactRepository;

    // Métodos para realizar operaciones CRUD
    public List<Contact> getAllContacts() {
        return contactRepository.findAll(); // Devuelve todos los contactos
    }

    public Contact getContactById(int id) {
        return contactRepository.findById(id).orElse(null); // Devuelve un contacto por su ID, o null si no existe
    }

    public Contact createContact(Contact contacto) {
        return contactRepository.save(contacto); // Guarda un nuevo contacto
    }

    public void deleteContact(int id) {
        contactRepository.deleteById(id); // Elimina un contacto por su ID
    }
}
