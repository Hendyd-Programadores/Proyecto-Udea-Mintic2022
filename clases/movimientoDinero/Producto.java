package clases.movimientoDinero;

public class Producto extends Insumo {
    private double valorVenta;

    public Producto(int idProducto, String nombre, String NITproveedor, double precio, int cantidadBodega, int cantidadMinReq, double valorVenta) {
        super(idProducto, nombre, NITproveedor, precio, cantidadBodega, cantidadMinReq);
        this.setValorVenta(valorVenta);
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "valorVenta=" + valorVenta +" ,"+
                super.toString()+
                "} ";
    }
}
