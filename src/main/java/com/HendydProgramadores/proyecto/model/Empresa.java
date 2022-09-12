package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="empresas")
public class Empresa {
    @Id
    @Column(name="id")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    //Atributos
    private double idEmpresa;
    private String nombre;
    private String direccion;
    private int telefono;
    private long nit;
    @ManyToOne
    @JoinColumn(name = "usuarios_id_empleado")
    private Empleado usuarios;
    private MovimientoDinero transacciones;
    private Date createdAt;
    private Date updateAt;

    //Constructor
    public Empresa(double idEmpresa, String nombre, String direccion, int telefono, long nit) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.usuarios = usuarios;
        this.transacciones = transacciones;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Empresa() {
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public Empleado getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Empleado usuarios) {
        this.usuarios = usuarios;
    }

    public MovimientoDinero getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(MovimientoDinero transacciones) {
        this.transacciones = transacciones;
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
        return "Empresa{" +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", NIT=" + nit +
                '}';
    }
}
