package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.ObjetAnswer;
import com.HendydProgramadores.proyecto.service.InterfaceEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestEmpleadoController {


    //Hacemos la inyeccion del objeto de tipo InterfaceEmpleadoServicio
    @Autowired
    InterfaceEmpleadoService interfaceEmpleadoService;

    //Creamos los Mapping

    //Mapping para listar Empleados
    @GetMapping("/ListEmployee")
    public ResponseEntity<List<Empleado>> getEmployee(){
        return new ResponseEntity<>(interfaceEmpleadoService.getEmployee(), HttpStatus.ACCEPTED);
    }

    //Mapping para traer una solo Empleado
    @GetMapping("/OneEmployee/{idEmployee}")
    public ResponseEntity<Object> getEmployeePath(@PathVariable Long idEmployee){
        try {
            Empleado EmployeeX = interfaceEmpleadoService.getOnlyOneEmployee(idEmployee);
            return new ResponseEntity<>(EmployeeX,HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para crear un Empleado
    @PostMapping("/CreateEmployee")
    public ResponseEntity<String> PostCreateEmployee(@RequestBody Empleado EmployeeX){
        try {
            String message = interfaceEmpleadoService.getCreateEmployee(EmployeeX);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para actualizar un Empleado
    @PutMapping("/UpdateEmployee")
    public ResponseEntity<ObjetAnswer> putUpdateEmployee(@RequestBody Empleado EmployeeX){
        try {
            Empleado EmployeeBD = interfaceEmpleadoService.getUpdateEmployee(EmployeeX);
            return new ResponseEntity<>(new ObjetAnswer("Atualizacion de Employee Exitosa",EmployeeBD),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ObjetAnswer(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para eliminar un Empleado
    @DeleteMapping("/DeleteEmployee/{idEmployee}")
    public ResponseEntity<String> DeleteEmployee(@PathVariable Long idEmployee){
        try {
            String message = interfaceEmpleadoService.getDeleteEmployee(idEmployee);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


}

