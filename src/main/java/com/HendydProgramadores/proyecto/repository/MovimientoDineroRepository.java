package com.HendydProgramadores.proyecto.repository;

import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoDineroRepository<T> extends JpaRepository<MovimientoDinero, Long> {
    //GET
    @Query(value = "select * from Empresa", nativeQuery = true)
    public abstract List<MovimientoDinero> findAll();

    //POST

    //PATCH

    //DELETE
}
