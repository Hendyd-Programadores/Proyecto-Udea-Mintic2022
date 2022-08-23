//Se crea clase principal
//importar la librería Java
import java.util.Scanner;
public class main {
    //se crea método
    public static void main(String[] args) {
        //Se crea objeto persona
        Persona Estudiante = new Persona();
        //Se crea objeto scanner
        Scanner Esc = new Scanner(System.in);
        String Nombres, Apellidos, Id, correoElectronico, pais;
        int Edad;
        //Se ordena imprimir indicaciones
        System.out.println("Ingrese su nombre: ");
        Nombres = Esc.next();
        Estudiante.setNombres(Nombres);
        System.out.println("Ingrese sus apellidos: ");
        Apellidos = Esc.next();
        Estudiante.setApellidos(Apellidos);
        System.out.println("Ingrese su Id (identificacion): ");
        Id = Esc.next();
        Estudiante.setId(Id);
        System.out.println("Ingrese su correo electronico: ");
        correoElectronico = Esc.next();
        Estudiante.setCorreoElectronico(correoElectronico);
        System.out.println("Ingrese su pais de residencia: ");
        pais = Esc.next();
        Estudiante.setPais(pais);
        System.out.println("ingrese su edad (#): ");
        Edad = Esc.nextInt();
        Estudiante.setEdad(Edad);
        System.out.println("\n-------DATOS DEL ESTUDIANTE----------" +
                "\n Nombres: " + Estudiante.getNombres()
                + "\n Apellidos:" + Estudiante.getApellidos()
                + "\n Id: " + Estudiante.getId()
                + "\n correo electronico: " + Estudiante.getCorreoElectronico()
                + "\n Pais: " + Estudiante.getPais()
                + "\n Edad: " + Estudiante.getEdad());
        //Se crea objeto estudiante
        Persona Estu = new Persona("Pedro Pablo", "Alfaro", "7925456656", "palfaro@hotmail.com", "costa Rica", 23);
        //se pide ingresar datos
        System.out.println("\n-------DATOS DEL ESTUDIANTE----------" +
                "\n Nombres: " + Estu.getNombres()
                + "\n Apellidos: " + Estu.getApellidos()
                + "\n Id: " + Estu.getId()
                + "\n correo electronico: " + Estu.getCorreoElectronico()
                + "\n Pais: " + Estu.getPais()
                + "\n Edad: " + Estudiante.getEdad());
    }
}