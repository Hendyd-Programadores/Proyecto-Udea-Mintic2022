package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.repository.EmployedRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    @Autowired
    EmployedRepository employedRepository;

    public List<Empleado> verUsuarios(){
        List<Empleado> usuarios = new ArrayList<Empleado>();
        usuarios.addAll(employedRepository.findAll());
        return usuarios;
    }
    public List<Empleado> verUsuarioById(Long id){
        List<Empleado> usuario = new ArrayList<Empleado>();
        usuario.addAll(employedRepository.findAllById(id).get(id));
        return usuario;
    }
    public void crearUsuario(Empleado empleado){
        employedRepository.save(empleado);
    }
    public void editarUsuario(Empleado empleado){
        employedRepository.save(empleado);
    }
    public void eliminarUsuario(Long id){
        employedRepository.deleteById(id);
    }
}