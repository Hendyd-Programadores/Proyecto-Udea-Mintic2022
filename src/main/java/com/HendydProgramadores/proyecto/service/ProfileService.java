package com.HendydProgramadores.proyecto.service;

import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.model.Profile;
import com.HendydProgramadores.proyecto.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    //GET
    public List<Profile> verPerfiles(){
        return new ArrayList<Profile>(profileRepository.findAll());
    }
    public Profile verPerfilById(Long id){
        return (Profile) profileRepository.findById(id).get();
    }
    //POST
    public void crearPerfil(Profile profile){
        profileRepository.save(profile);
    }

    //PATCH
    public void editarPerfil(Long id, Profile profile){
        profile.setId(id);
        profileRepository.save(profile);
    }

    //DELETE
    public void eliminarPerfil(Long id){
        profileRepository.deleteById(id);
    }
}
