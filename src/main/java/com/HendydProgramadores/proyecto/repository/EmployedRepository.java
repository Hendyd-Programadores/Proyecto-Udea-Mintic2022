package com.HendydProgramadores.proyecto.repository;

import com.HendydProgramadores.proyecto.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployedRepository  extends JpaRepository<Empleado, Long> {

    //Object findAllById(Long id);
}


