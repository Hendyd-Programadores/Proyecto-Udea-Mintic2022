package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.repository.EmployedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService implements InterfaceEmpleadoServicio {

    Date Today = new Date();

    //Inyectamos un Objeto de tipo EmployedRepository
    @Autowired
    EmployedRepository repositoryEmployee;

    //GET
    @Override
    public List<Empleado> getEmployee() {
        return repositoryEmployee.findAll();
    }

    //GET
    @Override
    public Empleado getOnlyOneEmployee(Long idEmployee) throws Exception {
        Optional<Empleado> EmployeeBD = repositoryEmployee.findById(idEmployee);
        if(EmployeeBD.isPresent()){
            return EmployeeBD.get();
        }
        throw new Exception("No Se Existe");
    }

    //POST
    @Override
    public String getCreateEmployee(Empleado EmployeeIn) {
        //Preguntamos si ya hay alguna Employee ya registrada con ese Id.
        Optional<Empleado> EmployeeBD = repositoryEmployee.findById(EmployeeIn.getIdEmpleado());
        if(!EmployeeBD.isPresent()){
            repositoryEmployee.save(EmployeeIn);
            return "Empleado Creado con exito";

        }
        return ("Ese Id ya Existe");
    }

    //PATCH
    @Override
    public Empleado getUpdateEmployee(Empleado EmployeeIn) throws Exception {
        //LLamamos a la Employee a actualizar de la BD
        Empleado EmployeeBD = getOnlyOneEmployee(EmployeeIn.getIdEmpleado());

        //Actualizamos atributos
        if(EmployeeIn.getNombreEmpleado()!=null && !EmployeeIn.getNombreEmpleado().equals("")){
            EmployeeBD.setNombreEmpleado(EmployeeIn.getNombreEmpleado());
        }

        if(EmployeeIn.getEmailEmpleado()!=null && !EmployeeIn.getEmailEmpleado().equals("")){
            EmployeeBD.setEmailEmpleado(EmployeeIn.getEmailEmpleado());
        }

        if(EmployeeIn.getRolesEmployee()!=null && !EmployeeIn.getRolesEmployee().equals("")){
            EmployeeBD.setRolesEmployee(EmployeeIn.getRolesEmployee());
        }

        if(EmployeeIn.getTelefonoEmpleado()!=null && !EmployeeIn.getTelefonoEmpleado().equals("")){
            EmployeeBD.setTelefonoEmpleado(EmployeeIn.getTelefonoEmpleado());
        }

        EmployeeBD.setUpdateAt(Today);

        return repositoryEmployee.save(EmployeeBD);
    }

    //DELETE
    @Override
    public String getDeleteEmployee(Long idEmployee) throws Exception {
        Optional<Empleado> EmployeeBD = repositoryEmployee.findById(idEmployee);
        if(EmployeeBD.isPresent()){
            repositoryEmployee.deleteById(idEmployee);
            return "Empleado Elimado";
        }
        throw new Exception("Empleado No Existe");
    }

}






