package com.example.tarea.spring.boot; // Declaración del paquete e importaciones necesarias

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controlador {
    
    @GetMapping("/hello")
    public String sayHello() {
        String tu_nombre = "José Manuel";
        String hora = java.time.LocalTime.now().withSecond(0).withNano(0).toString();
        String fecha = java.time.LocalDate.now().toString();
        return "Hola " + tu_nombre + ", son las " + hora + " del " + fecha;
    }
}
