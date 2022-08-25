package clases.empresa;

public class Empresa {
    private String NIT;
    private String nombre;
    private String direccion;
    private String telefono;
    private String whatsapp;
    private String correo;
    private String paginaWeb;
    private int id;

    public Empresa(int id, String NIT, String nombre, String direccion, String telefono,String whatsapp, String correo, String paginaWeb) {
        this.id = id;
        this.NIT = NIT;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.whatsapp = whatsapp;
        this.correo = correo;
        this.paginaWeb = paginaWeb;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void mostrar(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "NIT='" + NIT + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", whatsapp='" + whatsapp + '\'' +
                ", correo='" + correo + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", id=" + id +
                '}';
    }
}
