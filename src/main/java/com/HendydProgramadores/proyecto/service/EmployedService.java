package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.repository.EmployedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployedService {
    @Autowired
    EmployedRepository employedRepository;

    //GET
    public List<Empleado> verUsuarios(){
        return new ArrayList<Empleado>(employedRepository.findAll());
    }
    public Empleado verUsuarioById(Long id){
        return (Empleado) employedRepository.findById(id).get();
    }
    //POST
    public void crearUsuario(Empleado empleado){
        employedRepository.save(empleado);
    }

    //PATCH
    public void editarUsuario(Long id, Empleado empleado){
        empleado.setIdEmpleado(id);
        employedRepository.save(empleado);
    }

    //DELETE
    public void eliminarUsuario(Long id){
        employedRepository.deleteById(id);
    }


}