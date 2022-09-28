package com.HendydProgramadores.proyecto.webControllers;
import com.HendydProgramadores.proyecto.service.EmployedService;
import com.HendydProgramadores.proyecto.service.EnterpriseService;
import com.HendydProgramadores.proyecto.service.MovimientoDineroService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {

    @GetMapping()
    public String index (){
        return "index";
    }

}
