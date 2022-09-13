package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MovimientoDinero {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue( strategy = GenerationType.AUTO)
    //Atributos
    private Long id;
    private String concepto;
    private float monto;
    @OneToOne
    @JoinColumn(name = "id_empleado")
    private Empleado usuario;
    @OneToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    private Date createdAt;
    private Date updateAt;

    //Constructor

    public MovimientoDinero(String concepto, float monto, Empleado usuario) {
        this.concepto = concepto;
        this.monto = monto;
        this.usuario = usuario;
    }

    public MovimientoDinero() {
    }

    public MovimientoDinero(String pago_de_servicios_publicos, int monto, String nombreEmpleado) {
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
