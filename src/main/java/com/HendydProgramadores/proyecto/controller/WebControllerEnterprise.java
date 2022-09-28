package com.HendydProgramadores.proyecto.controller;
import com.HendydProgramadores.proyecto.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class WebControllerEnterprise {
    @Autowired
    EnterpriseService enterpriseService;
    @GetMapping("/index")
    public String showEnterprise(){
        return "index";
    }

}
