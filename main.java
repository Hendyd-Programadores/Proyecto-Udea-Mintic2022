//Se crea clase principal
//importar la librería Java
import clases.empresa.Empresa;
import clases.roles.Administrador;
import clases.roles.Empleado;
import clases.Persona;

public class main {
    //se crea método
    public static void main(String[] args) {
        /*
        //Se crea objeto persona
        Persona Empleado = new Persona();
        //Se crea objeto scanner
        Scanner Esc = new Scanner(System.in);
        String nombres,  correoElectronico,  nit,  direccion,  telefono,  whatsapp;

        int Id;
        //Se ordena imprimir indicaciones

        System.out.println("Ingrese su nombre: ");
        nombres = Esc.next();
        Empleado.setNombres(nombres);
        System.out.println("Ingrese su nit: ");
        nit = Esc.next();
        Empleado.setNIT(nit);
        System.out.println("Ingrese su Id (identificacion): ");
        Id = Esc.nextInt();
        Empleado.setId(Id);
        System.out.println("Ingrese su correo electronico: ");
        correoElectronico = Esc.next();
        Empleado.setCorreoElectronico(correoElectronico);
        System.out.println("Ingrese su direccion: ");
        direccion = Esc.next();
        Empleado.setDireccion(direccion);
        System.out.println("ingrese su telefono: ");
        telefono = Esc.next();
        Empleado.setTelefono(telefono);
        System.out.println("ingrese su whatsapp: ");
        whatsapp = Esc.next();
        Empleado.setWhatsapp(whatsapp);
        System.out.println("\n-------DATOS DEL PERSONA----------\n"+Empleado);
         */
        //Se crea objeto estudiante
        Empresa empresa = new Empresa(1,"111111","Empresa Ejemplo","cr 30 #12-23","3214532143","3215438976","ejemplo@empresa.com","www.ejemplo.com");
        empresa.mostrar();
        Persona Emplea= new Persona(1, "Alfaro Gomez", "palfaro@hotmail.com", "7925456656", "cll 12 #12-12","3002318674","3002318674");
        //se pide ingresar datos
        System.out.println("\n-------DATOS DEL PERSONA----------\n"+Emplea);
        Empleado empleado1 = new Empleado(2,"Juan Perez","juan@gmail.com","1234567","cll 1 #2-3","3001235463","3003212342",1,2500000,"Globant");
        empleado1.mostrar();
        Administrador admin = new Administrador(1,"Juana","juana@gmail.com","342","cll 12","321423","32353",3,1500000,"Globant",1,"Ventas");
        admin.mostrar();
    }
}
