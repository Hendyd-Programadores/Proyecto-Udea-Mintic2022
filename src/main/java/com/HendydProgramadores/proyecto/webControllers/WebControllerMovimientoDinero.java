package com.HendydProgramadores.proyecto.webControllers;

import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.service.MovimientoDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/agregarTransaccion")
    public String agregarTransaccion(@ModelAttribute MovimientoDinero transaccion, Model model){
        model.addAttribute("transaccion", new MovimientoDinero());
        return "agregarTransaccion";
    }

    @PostMapping("/agregarTransaccion")
    public String guardarTransaccion(@ModelAttribute MovimientoDinero transaccion, Model model){
        controlador.crearMovimiento(transaccion);
        return "redirect:/verTransacciones";
    }

}
