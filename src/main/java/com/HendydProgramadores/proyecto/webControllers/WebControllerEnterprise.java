package com.HendydProgramadores.proyecto.webControllers;

//<<<<<<<< HEAD:src/main/java/com/HendydProgramadores/proyecto/webControllers/WebController.java
//package com.HendydProgramadores.proyecto.webControllers;
//========
//package com.HendydProgramadores.proyecto.controller;
//>>>>>>>> ea9b8b4b62b77a8f9dd16d5b3128be67dbb64727:src/main/java/com/HendydProgramadores/proyecto/controller/WebControllerEnterprise.java
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class WebControllerEnterprise {
    @Autowired
    EnterpriseService enterpriseService;
    @GetMapping("/index")
    public String showEnterprise(){
        return "index";
    }
    @GetMapping("/listaEmpresas")
    public  String lista(Model model) {
        List<Empresa> listadoTransacciones = enterpriseService.listEmpresas();
        model.addAttribute("atributo", "atributo");
        return "listaEmpresas";
    }
}
