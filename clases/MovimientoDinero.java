package clases;

public class MovimientoDinero {
    private String concepto;
    private float monto;

    public MovimientoDinero(String concepto, float monto) {
        this.concepto = concepto;
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void movimientoDinero(){

    }
    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto=" + monto +
                ", concepto='" + concepto + '\'' +
                '}';
    }

}