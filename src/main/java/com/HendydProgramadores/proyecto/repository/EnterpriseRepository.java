package com.HendydProgramadores.proyecto.repository;

import com.HendydProgramadores.proyecto.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface EnterpriseRepository<T> extends JpaRepository<Empresa, Integer> {

}
