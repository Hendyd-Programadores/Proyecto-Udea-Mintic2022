package com.HendydProgramadores.proyecto.repository;

import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepository<T> extends JpaRepository<MovimientoDinero, Long> {
}
