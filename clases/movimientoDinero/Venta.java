package clases.movimientoDinero;

public class Venta {
    private int idVenta;
    int idCliente;
    int idProducto;


    public Venta(int idVenta, int idCliente,int idProducto) {
        this.setIdVenta(idVenta);
        this.idCliente = idCliente;
        this.idProducto = idProducto;
    }


    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public void mostrar(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Venta{" +
                "idVenta=" + idVenta +
                ", idCliente=" + idCliente +
                ", idProducto=" + idProducto +
                '}';
    }
}
