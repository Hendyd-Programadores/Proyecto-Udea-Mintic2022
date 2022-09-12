package com.HendydProgramadores.proyecto;

import com.HendydProgramadores.proyecto.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	Empresa empresa1 = new Empresa();
	Empleado empleado1 = new Empleado();
	MovimientoDinero movimiento1 = new MovimientoDinero();

}
