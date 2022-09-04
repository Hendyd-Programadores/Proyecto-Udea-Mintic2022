package clases.roles;

public class Administrador extends Empleado {
    private int idAdmin;
    private String categoria;

    public Administrador(int id, String nombres, String correoElectronico, String nit, String direccion, String telefono, String whatsapp, int idEmpelado,double sueldoBruto,String empresa,int idAdmin, String categoria) {
        super(id, nombres, correoElectronico, nit, direccion, telefono, whatsapp,idEmpelado, sueldoBruto, empresa);
        this.setIdAdmin(idAdmin);
        this.setCategoria(categoria);
    }


    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "idAdmin=" + idAdmin +
                ", categoria='" + categoria +" ,"
                + super.toString()+ '\''+
                "} " ;
    }
}
