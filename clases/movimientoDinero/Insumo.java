package clases.movimientoDinero;

public class Insumo {
    protected int idProducto;
    protected String nombre;
    protected String NITproveedor;
    protected double precio;
    protected int cantidadBodega;
    protected int cantidadMinReq;

    public Insumo(int idProducto,String nombre,String NITproveedor, double precio, int cantidadBodega,int cantidadMinReq) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.NITproveedor = NITproveedor;
        this.precio = precio;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinReq = cantidadMinReq;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNITproveedor() {
        return NITproveedor;
    }

    public void setNITproveedor(String NITproveedor) {
        this.NITproveedor = NITproveedor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinReq() {
        return cantidadMinReq;
    }

    public void setCantidadMinReq(int cantidadMinReq) {
        this.cantidadMinReq = cantidadMinReq;
    }

    public void mostrar(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Insumo{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", NITproveedor='" + NITproveedor + '\'' +
                ", precio=" + precio +
                ", cantidadBodega=" + cantidadBodega +
                ", cantidadMinReq=" + cantidadMinReq +
                '}';
    }
}
