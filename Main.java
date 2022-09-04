//Se crea clase principal
//importar la librería Java
import clases.*;

public class main {
    //se crea método
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();
        empresa1.setNombre("Hendyd Programadores");
        empresa1.setDireccion("CRA 30 12-23");
        empresa1.setTelefono(4452812);
        empresa1.setNit(1123456789-1);
        System.out.println("La empresa es: " + empresa1.getNombre() + ", identificada con el NIT " + empresa1.getNit() + ", ubicada en la " + empresa1.getDireccion() + "y con el número de contacto " + empresa1.getTelefono() + ".");

        Empleado empleado1 = new Empleado();
        empleado1.setEmpresa(empresa1);
        empleado1.setIdEmpleado(1192756384);
        empleado1.setNombreEmpleado("Juliana Perea");
        empleado1.setCorreoEmpleado("juliana.perea@gmail.com");
        empleado1.setRolEmpleado(Roles.ADMINISTRADOR);
        System.out.println("El empleado se llama " + empleado1.getNombreEmpleado() + ", identificada con el ID " + empleado1.getIdEmpleado() + ", con el correo " + empleado1.getCorreoEmpleado() + "y desempeñando el Rol de " + empleado1.getRolEmpleado());

        MovimientoDinero movimiento1 = new MovimientoDinero();
        movimiento1.setConcepto();
        movimiento1.setMonto();
    }
}
