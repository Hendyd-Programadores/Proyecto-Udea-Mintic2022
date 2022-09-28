package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.service.EmployedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployedController {

    @Autowired
    private EmployedService employedService;

    @GetMapping("/employees")
    private List<Empleado> listEmpleados(){
        return employedService.verUsuarios();
    }

    @PostMapping("/employed")
    private void crearUsuario(@RequestBody Empleado empleado){
        employedService.crearUsuario(empleado);
    }

    @GetMapping("/employed/{id}")
    private void verUsuarioById(@PathVariable Long id){
        employedService.verUsuarioById(id);
    }

    @PatchMapping("/employed/{id}")
    private void editarUsuario(@PathVariable Long id, @RequestBody Empresa empresa){
        employedService.editarUsuario(id, new Empleado());
    }

    @PutMapping("/employed/{id}")
    private void editatUsuarioPut(@PathVariable Long id, @RequestBody Empresa empresa){
        employedService.editarUsuario(id, new Empleado());
    }

    @DeleteMapping("/employed/{id}")
    private void eliminarUsuario(@PathVariable("id") Long id){
        employedService.eliminarUsuario(id);
    }


}
