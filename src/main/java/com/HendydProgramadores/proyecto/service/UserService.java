package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.repository.EmployedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Autowired
    EmployedRepository employedRepository;

    //GET
    public List<Empleado> verUsuarios(){
        return employedRepository.findAll();
    }
    public Empleado verUsuarioById(Long id){
        return (Empleado) employedRepository.findAllById(id);
    }
    //POST
    public void crearUsuario(Empleado empleado){
        employedRepository.save(empleado);
    }

    //PATCH
    public void editarUsuario(Long id, Empleado empleado){
        Empleado empleadoAuxiliar = new Empleado();
        empleadoAuxiliar.setNombreEmpleado(empleadoAuxiliar.getNombreEmpleado());
        empleadoAuxiliar.setCorreoEmpleado(empleadoAuxiliar.getCorreoEmpleado());
        empleadoAuxiliar.setRolEmpleado(empleadoAuxiliar.getRolEmpleado());
        employedRepository.save(empleadoAuxiliar);
    }

    //DELETE
    public boolean eliminarUsuario(Long id){
        employedRepository.deleteById(id);
        return true;
    }
}