package com.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Contact;
import com.example.services.ContactService;

// Indica que esta clase es un controlador REST.
// Los controladores REST manejan las solicitudes HTTP y devuelven respuestas en formato JSON o XML.
@RestController
// Define la ruta base para todas las solicitudes que manejará este controlador. En este caso, todas las rutas comenzarán con /api/contactos.
@RequestMapping("/api/contactos")

public class ContactController {
    
    // Se inyecta el servicio de Contacto para poder utilizar sus métodos.
    private ContactService contactService;
    
    // Agregar métodos para manejar las solicitudes HTTP relacionadas con Contacto
    // Obtener todos los contactos
    @GetMapping("/")
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    // Obtener un contacto por ID
    @GetMapping("/{id}")
    public Contact getContactById(int id) {
        return contactService.getContactById(id);
    }

    // Crear un nuevo contacto
    @PostMapping("/")
    public Contact createContact(@RequestBody Contact contacto) {
        return contactService.createContact(contacto);
    }

    // Eliminar un contacto por ID
    @PostMapping("/delete/{id}")
    public void deleteContact(int id) {
        contactService.deleteContact(id);
    }
    
}
