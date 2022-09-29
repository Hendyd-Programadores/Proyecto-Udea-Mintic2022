package com.HendydProgramadores.proyecto.webControllers;

import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.service.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WebControllerMovimientoDinero {

    @Autowired
    MovimientoDineroService controlador;

    @GetMapping("/inico")
    public String mostrarMv(){
        return "inicio";}

    @GetMapping("/verTransacciones")
    public  String lista(Model model){
        List<MovimientoDinero> listadoTransacciones = controlador.verMovimientos();
        model.addAttribute("atributo", "atributo");
        return "verTransacciones";
    }
}
