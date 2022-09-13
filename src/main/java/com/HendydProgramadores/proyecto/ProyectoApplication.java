package com.HendydProgramadores.proyecto;

import com.HendydProgramadores.proyecto.model.Empleado;
import com.HendydProgramadores.proyecto.model.Empresa;
import com.HendydProgramadores.proyecto.model.MovimientoDinero;
import com.HendydProgramadores.proyecto.model.Roles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class ProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	Empresa empresa = new Empresa("Hendyd Programadores", "Calle 10 #10 - 10", 4858585, 800123456 );
	Empleado usuario = new Empleado(1190123456, empresa, "Pepita Perez", "pepita.perez@hendyd.com", Roles.Operario);
	MovimientoDinero transaccion = new MovimientoDinero("Pago de servicios publicos", 3450800, usuario.getNombreEmpleado());

}
