package com.HendydProgramadores.proyecto.repository;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployedRepository <T> extends JpaRepository<Empleado, Long> {
}
