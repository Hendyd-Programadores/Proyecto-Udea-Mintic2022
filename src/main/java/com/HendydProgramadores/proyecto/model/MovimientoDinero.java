package com.HendydProgramadores.proyecto.model;

import java.util.Date;

public class MovimientoDinero {

    //Atributos
    private long id;
    private String concepto;
    private float monto;
    private Empleado usuario;
    private Empresa empresa;
    private Date createdAt;
    private Date updateAt;

    //Constructor

    public MovimientoDinero(long id, String concepto, float monto, Empleado usuario, Empresa empresa, Date createdAt, Date updateAt) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.usuario = usuario;
        this.empresa = empresa;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public MovimientoDinero() {
    }

    //Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto=" + monto +
                ", concepto='" + concepto + '\'' +
                '}';
    }
}
