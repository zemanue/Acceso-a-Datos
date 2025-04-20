package com.example.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    // Obtiene la lista de todos los contactos
    @GetMapping("/")
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    // Obtiene un contacto específico por su ID
    @GetMapping("/{id}")
    public Contact getContactById(int id) {
        return contactService.getContactById(id);
    }

    // Crea un nuevo contacto (envía un objeto Contacto en el cuerpo de la solicitud)
    @PostMapping("/")
    public Contact createContact(@RequestBody Contact contacto) {
        return contactService.createContact(contacto);
    }

    // Actualiza un contacto existente por su ID
    @PutMapping("/{id}")
    public Contact updateContact(int id, @RequestBody Contact contacto) {
        return contactService.updateContact(id, contacto);
    }

    // Elimina un contacto por su ID
    @DeleteMapping("/{id}")
    public boolean deleteContact(int id) {
        return contactService.deleteContact(id);
    }
    
}
