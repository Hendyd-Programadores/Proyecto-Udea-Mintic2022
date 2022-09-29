package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.repository.MovimientoDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoDineroService {
    @Autowired
    MovimientoDineroRepository movimientoDineroRepository;

    //GET
    public List<MovimientoDinero> verMovimientos(){
        return new ArrayList<MovimientoDinero>(movimientoDineroRepository.findAll());
    }
    public MovimientoDinero verMovimiento(Long id){
        return (MovimientoDinero) movimientoDineroRepository.findById(id).get();
    }

    public  List<MovimientoDinero> verMovimientosEmpresa(Long id, List<MovimientoDinero> deEmpresa){
        List<MovimientoDinero> aux = new ArrayList<MovimientoDinero>();
        for (int i = 0; i < deEmpresa.size(); i++) {
            if(deEmpresa.get(i).getId() == id){
                aux.add(deEmpresa.get(i));
            }
        }
        return aux;
    }
    //POST
    public void crearMovimiento(MovimientoDinero movimientoDinero){
        movimientoDineroRepository.save(movimientoDinero);
    }

    //PATCH
    public void editarMovimiento(Long id, MovimientoDinero movimientoDinero){
        movimientoDinero.setId(id);
        movimientoDineroRepository.save(movimientoDinero);
    }

    //DELETE
    public void eliminarMovimiento(Long id){
        movimientoDineroRepository.deleteById(id);
    }
}
