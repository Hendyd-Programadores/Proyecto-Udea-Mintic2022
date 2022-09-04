package clases.roles;

import clases.Persona;

public class Cliente extends Persona {
    private int idCliente;
    private String pedido;

    public Cliente(int id, String nombres, String correoElectronico, String nit, String direccion, String telefono, String whatsapp, int idCliente, String pedido) {
        super(id, nombres, correoElectronico, nit, direccion, telefono, whatsapp);
        this.idCliente = idCliente;
        this.pedido = pedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", pedido='" + pedido + " ,"
                +  super.toString() +'\''+
                "} " ;
    }
}
