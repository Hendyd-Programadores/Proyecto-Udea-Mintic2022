package com.HendydProgramadores.proyecto.controller;

import com.HendydProgramadores.proyecto.model.Profile;
import com.HendydProgramadores.proyecto.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {
    @Autowired
    ProfileService profileService;

    @GetMapping("/profiles")
    private List<Profile> listPerfiles(){
        return profileService.verPerfiles();
    }

    @GetMapping("/profile/{id}")
    private void verPerfilById(@PathVariable Long id){
        profileService.verPerfilById(id);
    }

    @PostMapping("/newProfile")
    private void crearPerfil(@RequestBody Profile profile){
        profileService.crearPerfil(profile);
    }

    @PatchMapping("/profile/{id}")
    private void editarPerfil(@PathVariable Long id, @RequestBody Profile profile){
        profileService.editarPerfil(id, profile);
    }

    @DeleteMapping("/profile/{id}")
    private void deleteByEnterprise(@PathVariable("id") Long id){
        profileService.eliminarPerfil(id);
    }
}