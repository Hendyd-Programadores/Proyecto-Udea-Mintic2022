//Se crea clase principal
//importar la librería Java
import java.util.Scanner;
public class main {
    //se crea método
    public static void main(String[] args) {
        //Se crea objeto persona
        Persona Empleado = new Persona();
        //Se crea objeto scanner
        Scanner Esc = new Scanner(System.in);
        String Nombres, Apellidos, Id, correoElectronico, cargo;
        int Edad;
        //Se ordena imprimir indicaciones
        System.out.println("Ingrese su nombre: ");
        Nombres = Esc.next();
        Empleado.setNombres(Nombres);
        System.out.println("Ingrese sus apellidos: ");
        Apellidos = Esc.next();
        Empleado.setApellidos(Apellidos);
        System.out.println("Ingrese su Id (identificacion): ");
        Id = Esc.next();
        Empleado.setId(Id);
        System.out.println("Ingrese su correo electronico: ");
        correoElectronico = Esc.next();
        Empleado.setCorreoElectronico(correoElectronico);
        System.out.println("Ingrese su cargo: ");
        pais = Esc.next();
        Empleado.setCargo(Cargo);
        System.out.println("ingrese su edad (#): ");
        Edad = Esc.nextInt();
        Empleado.setEdad(Edad);
        System.out.println("\n-------DATOS DEL ESTUDIANTE----------" +
                "\n Nombres: " + Empleado.getNombres()
                + "\n Apellidos:" + Empeado.getApellidos()
                + "\n Id: " + Empleado.getId()
                + "\n correo electronico: " + Empleado.getCorreoElectronico()
                + "\n Cargo: " + Empleado.getCargo()
                + "\n Edad: " + Empleado.getEdad());
        //Se crea objeto estudiante
        Persona Emplea= new Persona("Pedro Pablo", "Alfaro", "7925456656", "palfaro@hotmail.com", "costa Rica", 23);
        //se pide ingresar datos
        System.out.println("\n-------DATOS DEL ESTUDIANTE----------" +
                "\n Nombres: " + Emplea.getNombres()
                + "\n Apellidos: " + Emplea.getApellidos()
                + "\n Id: " + Emplea.getId()
                + "\n correo electronico: " + Emplea.getCorreoElectronico()
                + "\n Cargo: " + Emplea.getCargo()
                + "\n Edad: " + Emplea.getEdad());
    }
}
