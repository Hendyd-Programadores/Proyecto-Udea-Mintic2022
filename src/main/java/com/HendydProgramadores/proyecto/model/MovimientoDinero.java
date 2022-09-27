package com.HendydProgramadores.proyecto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Movimiento_Dinero")
public class MovimientoDinero {
    //Atributos
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "concepto")
    private String concepto;
    @Column(name = "monto")
    private float monto;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Empresa_id")
    private Empresa empresa;
    private Date createdAt;
    private Date updateAt;

    //Constructores

    public MovimientoDinero(long id, String concepto, float monto, Empleado empleado, Empresa empresa) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.empleado = empleado;
        this.empresa = empresa;
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

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "id=" + id +
                ", concepto='" + concepto + '\'' +
                ", monto=" + monto +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                '}';
    }
}
