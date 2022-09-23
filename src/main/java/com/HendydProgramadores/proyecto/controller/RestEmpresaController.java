package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.model.ObjetAnswer;
import com.HendydProgramadores.proyecto.service.InterfaceEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestEmpresaController {

    //Hacemos la inyeccion del objeto de tipo ServiceInterfaceEnterprise
    @Autowired
    InterfaceEmpresaService interfaceEmpresaService;

    //Creamos los Mapping

    //Mapping para listar Empresas
    @GetMapping("/ListEnterprise")
    public ResponseEntity<List<Empresa>> getEnterprise(){
        return new ResponseEntity<>(interfaceEmpresaService.getEnterprise(), HttpStatus.ACCEPTED);
    }

    //Mapping para traer una sola Empresa
    @GetMapping("/OneEnterprise/{idEnterprise}")
    public ResponseEntity<Object> getEnterprisePath(@PathVariable Long idEnterprise){
        try {
            Empresa EnterpriseX = interfaceEmpresaService.getOnlyOneEnterprise(idEnterprise);
            return new ResponseEntity<>(EnterpriseX,HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para crear una Empresa
    @PostMapping("/CreateEnterprise")
    public ResponseEntity<String> PostCreateEnterprise(@RequestBody Empresa EnterpriseX){
        try {
            String message =interfaceEmpresaService.getCreateEnterprise(EnterpriseX);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para actualizar una Empresa
    @PutMapping("/UpdateEnterprise")
    public ResponseEntity<ObjetAnswer> putUpdateEnterprise(@RequestBody Empresa EnterpriseX){
        try {
            Empresa EnterpriseBD = interfaceEmpresaService.getUpdateEnterprise(EnterpriseX);
            return new ResponseEntity<>(new ObjetAnswer("Atualizacion de Empresa Exitosa",EnterpriseBD),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new ObjetAnswer(e.getMessage(),null),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Mapping para eliminar una Empresa
    @DeleteMapping("/DeleteEnterprise/{idEnterprise}")
    public ResponseEntity<String> DeleteEnterprise(@PathVariable Long idEnterprise){
        try {
            String message = interfaceEmpresaService.getDeleteEnterprise(idEnterprise);
            return new ResponseEntity<>(message,HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
