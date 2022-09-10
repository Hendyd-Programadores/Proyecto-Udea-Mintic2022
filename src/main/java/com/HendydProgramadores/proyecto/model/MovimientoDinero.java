package com.HendydProgramadores.proyecto.model;

public class MovimientoDinero {

    //Atributos
    private String concepto;
    private float monto;

    //Constructor
    public MovimientoDinero(String concepto, float monto) {
        this.concepto = concepto;
        this.monto = monto;
    }

    public MovimientoDinero() {
    }

    //Getters and Setters
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
