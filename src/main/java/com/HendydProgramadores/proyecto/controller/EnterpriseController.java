package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnterpriseController {

    @Autowired
    EnterpriseService EnterpriseService;

    @GetMapping("/enterprise")
    private List<Empresa> listEmpresas(){
        return EnterpriseService.listEmpresas();
    }

    @PostMapping("/enterprise")
    private void addEmpresa(@RequestBody Empresa empresa){
        EnterpriseService.addEmpresa(empresa);
    }

    @GetMapping("/enterprise/{id}")
    private Empresa getEmpresaById(@PathVariable Long id){
        //Empresa empresaAuxiliar = EnterpriseService.getEmpresaById(id);
        return EnterpriseService.getEmpresaById(id);
    }
/*
    @PatchMapping("/enterprises/{id}")
    private void editEmpresa(@PathVariable Long id, @RequestBody Empresa empresa){
        EnterpriseService.editEmpresa(id, empresa);
    }

 */
    @PutMapping("/enterprise/{id}")
    private void editEmpresa(@RequestBody Empresa empresa){
        EnterpriseService.editEmpresa(empresa);
    }

    @DeleteMapping("/enterprise/{id}")
    private void deleteEmpresa(@PathVariable("id") Long id){
        EnterpriseService.deleteEmpresa(id);
    }
}