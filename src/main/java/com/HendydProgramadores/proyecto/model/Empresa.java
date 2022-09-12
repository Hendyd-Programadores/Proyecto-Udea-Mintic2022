package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;

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
    private Empleado empleado;

    private MovimientoDinero transacción;

    //Constructor
    public Empresa(double idEmpresa, String nombre, String direccion, int telefono, long nit) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
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
