package com.HendydProgramadores.proyecto;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.model.Roles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.lang.System.out;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	Empresa empresa1 = new Empresa("Hendyd Programadores", "Calle 10 #10 - 10", 4855555, 805877398);
	Empleado usuario = new Empleado("Pepita Maria", "pepita.maria@hotmail.com", Roles.Operario, empresa1);
	MovimientoDinero transacción = new MovimientoDinero("Pago de servicios publicos", 3450677, usuario);

}
