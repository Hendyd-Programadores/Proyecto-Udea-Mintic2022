package com.HendydProgramadores.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

class UserController {

    @GetMapping("/users")
    public String User(){
        return "Esto solo es una prueba";
    }
}
