package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.Empleado;

import java.util.List;

public interface InterfaceEmpleadoServicio {

    //Metodo que muestra todos los empleados
    public List<Empleado> getEmployee();

    //Metodo que consulta un Employee
    public Empleado getOnlyOneEmployee(Long idEmployee) throws Exception;

    //Metodo que crea un Employee
    public String getCreateEmployee(Empleado EmployeeIn);

    //Metodo que actualiza un Empleado
    public Empleado getUpdateEmployee(Empleado EmployeeIn) throws Exception;

    //Metodo que elimina un Empleado
    public String getDeleteEmployee(Long idEmployee) throws Exception;
}
