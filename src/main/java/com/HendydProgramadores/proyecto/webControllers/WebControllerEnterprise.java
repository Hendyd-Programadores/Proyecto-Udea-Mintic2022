package com.HendydProgramadores.proyecto.webControllers;

import com.HendydProgramadores.proyecto.model.Empresa;
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
    public String mostrarEm(){
        return "index";
    }

    @GetMapping("/listaEmpresas")
    public String lista(Model model){
        List<Empresa> x = enterpriseService.listEmpresas();
        model.addAttribute("x",x);
        return "listaEmpresas";
    }

}
