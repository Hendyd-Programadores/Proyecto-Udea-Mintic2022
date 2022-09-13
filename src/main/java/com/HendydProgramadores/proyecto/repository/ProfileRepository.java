package com.HendydProgramadores.proyecto.repository;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository <T> extends JpaRepository<Profile, String> {
}
