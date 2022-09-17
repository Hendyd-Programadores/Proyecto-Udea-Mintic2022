package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.repository.MovimientoDineroRepository;
import com.HendydProgramadores.proyecto.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController
public class MovementsController {
/*
    @Autowired
    private MovimientoDineroRepository repository;

    @GetMapping("/enterprises/[id]/movements")
    private void getByEnterprise(@PathVariable Long id) {
        repository.findAll();
    }
    @PostMapping("/enterprises/[id]/movements")
    private void saveByEnterprise(@PathVariable  Long id, @RequestBody MovimientoDinero transaccion) {
        repository.saveByEnterprise(id, transaccion);
    }
    @PatchMapping("/enterprises/[id]/movements")
    private void patchByEnterprise(@PathVariable Long id, @RequestBody MovimientoDinero movimientoDinero){
        repository.patchByEnterprise(id, movimientoDinero);
    }

    @DeleteMapping("/enterprises/[id]/movements")
    private void deleteByEnterprise(@PathVariable("id") Long id){
        repository.deleteByEnterprise(id);
    }

 */
}