package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.service.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovementsController {

    @Autowired
    private MovimientoDineroService movimientoDineroService;

    @GetMapping("/enterprises/{id}/movements")
    private List<MovimientoDinero> getByEnterprise(@PathVariable  Long id) {
        List<MovimientoDinero> deEmpresa = movimientoDineroService.verMovimientos();
        return movimientoDineroService.verMovimientosEmpresa(id,deEmpresa);
    }
    @GetMapping("/enterprises/movements")
    private List<MovimientoDinero> getByEnterprise() {
        return movimientoDineroService.verMovimientos();
    }

    @GetMapping("/enterprises/{id}/movement")
    private MovimientoDinero getById(@PathVariable  Long id) {
        return movimientoDineroService.verMovimiento(id);
    }
    @PostMapping("/enterprises/newMovements")
    private void saveByEnterprise(@RequestBody MovimientoDinero transaccion) {
        movimientoDineroService.crearMovimiento(transaccion);
    }
    @PatchMapping("/enterprises/{id}/movements")
    private void patchByEnterprise(@PathVariable Long id, @RequestBody MovimientoDinero movimientoDinero){
        movimientoDineroService.editarMovimiento(id, movimientoDinero);
    }

    @DeleteMapping("/enterprises/{id}/deleteMovements")
    private void deleteByEnterprise(@PathVariable("id") Long id){
        movimientoDineroService.eliminarMovimiento(id);
    }


}