package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name="Empresa")
public class Empresa {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue( strategy = GenerationType.AUTO)
    //Atributos
    private Double idEmpresa;
    private String nombre;
    private long nit;
    private int telefono;
    private String direccion;
    private Date createdAt;
    private Date updateAt;
    @OneToMany
    @JoinColumn(name = "Empleados_id")
    private ArrayList<Empleado> usuarios;
    @OneToMany
    @JoinColumn(name = "Transacciones_id")
    private MovimientoDinero transacciones;


    //Constructor
    public Empresa(String nombre, String direccion, int telefono, long nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public Empresa() {
    }

    //Getters and Setters

    public Double getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Double idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public ArrayList<Empleado> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Empleado> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<MovimientoDinero> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(MovimientoDinero transacciones) {
        this.transacciones = transacciones;
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
