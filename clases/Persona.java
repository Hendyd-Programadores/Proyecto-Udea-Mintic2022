package clases;

public class Persona {
    protected int Id;
    protected String Nombres;
    protected String Direccion;
    protected String Telefono;
    protected String Whatsapp;
    protected String CorreoElectronico;
    protected String NIT;


    //Se crea método constructor
    public Persona(){

    }
    //Se crea método constructor para todps los elementos
    public Persona(int id, String nombres, String correoElectronico, String nit, String direccion, String telefono,String whatsapp) {
        setId(id);
        setNombres(nombres);
        setCorreoElectronico(correoElectronico);
        setNIT(nit);
        setDireccion(direccion);
        setTelefono(telefono);
        setWhatsapp(whatsapp);
    }
    //Se crea métodos set y get

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        CorreoElectronico = correoElectronico;
    }
    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getWhatsapp() {
        return Whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        Whatsapp = whatsapp;
    }

    public void mostrar(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Id=" + Id +
                ", Nombres='" + Nombres + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Telefono='" + Telefono + '\'' +
                ", Whatsapp='" + Whatsapp + '\'' +
                ", CorreoElectronico='" + CorreoElectronico + '\'' +
                ", NIT='" + NIT + '\'' +
                '}';
    }
}
