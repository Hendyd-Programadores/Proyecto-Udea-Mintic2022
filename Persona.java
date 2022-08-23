public class Persona {
    String Id, Nombres, Apellidos, CorreoElectronico, Cargo;
    int Edad;
    //Se crea método constructor
    public Persona(){

    }
    //Se crea método constructor para todps los elementos
    public Persona(String id, String nombres, String apellidos, String correoElectronico, String cargo, int edad) {
        Id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        CorreoElectronico = correoElectronico;
        Pais = pais;
        Edad = edad;
    }
    //Se crea métodos set y get

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        Cargo = cargo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }
}
