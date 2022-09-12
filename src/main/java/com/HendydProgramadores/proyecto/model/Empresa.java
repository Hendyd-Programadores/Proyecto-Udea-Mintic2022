package com.HendydProgramadores.proyecto.model;

import java.util.Date;

public class Empresa {

    //Atributos
    String nombre;
    String direccion;
    int telefono;
    long nit;
    private Empleado usuarios;
    private MovimientoDinero transacciones;
    private Date createdAt;
    private Date updateAt;

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
