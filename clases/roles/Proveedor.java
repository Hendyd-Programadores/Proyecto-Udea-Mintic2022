package clases.roles;

import clases.Persona;

public class Proveedor extends Persona {

    private int idProveedor;
    private String pedido;

    public Proveedor(int id, String nombres, String correoElectronico, String nit, String direccion, String telefono, String whatsapp, int idProveedor,String pedido) {
        super(id, nombres, correoElectronico, nit, direccion, telefono, whatsapp);
        this.idProveedor = idProveedor;
        this.pedido = pedido;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "idProveedor=" + idProveedor +
                ", pedido='" + pedido + " ," +
                super.toString() +'\''+
                "} " ;
    }
}
