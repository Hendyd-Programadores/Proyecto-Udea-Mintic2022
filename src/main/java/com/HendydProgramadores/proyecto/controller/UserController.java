/*
package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class UserController {

    @Autowired
    private UserService UserService;

    @GetMapping("/users")
    private List<Empleado> listEmpleados(){
        return UserService.verUsuarios();
    }

    @PostMapping("/users")
    private void crearUsuario(@RequestBody Empleado empleado){
        UserService.crearUsuario(empleado);
    }

    @GetMapping("/user/[id]")
    private void verUsuarioById(@PathVariable Long id){
        UserService.verUsuarioById(id);
    }

    @PatchMapping("/user/[id]")
    private void editarUsuario(@PathVariable Long id, @RequestBody Empresa empresa){
        UserService.editarUsuario(id, new Empleado());
    }

    @DeleteMapping("/user/[id]")
    private void eliminarUsuario(@PathVariable("id") Long id){
        UserService.eliminarUsuario(id);
    }


}
*/
