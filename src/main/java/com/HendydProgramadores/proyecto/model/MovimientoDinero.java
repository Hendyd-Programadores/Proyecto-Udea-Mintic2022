package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Movimiento_Dinero")
public class MovimientoDinero {
    //Atributos
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;
    private String concepto;
    private float monto;
    private Date createdAt;
    private Date updateAt;

    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;


    @ManyToOne
    @JoinColumn(name = "Empresa_id")
    private Empresa empresa;


    //Constructor
    public MovimientoDinero(Long id, String concepto, float monto, Date createdAt, Date updateAt, Empresa empresa, Empleado empleado) {
        this.id = id;
        this.concepto = concepto;
        this.monto = monto;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
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
                "id=" + id +
                ", concepto='" + concepto + '\'' +
                ", monto=" + monto +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                '}';
    }
}
