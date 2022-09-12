package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado extends Empresa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Atributos
    private long idEmpleado;
    private String nombreEmpleado;
    private String correoEmpleado;
    private Roles rolEmpleado;
    private Profile perfil;
    private Empresa empresa;
    private MovimientoDinero transacciones;
    private Date createdAt;
    private Date updateAt;

    private Empresa empresa;

    //Constructor
    public Empleado(long idEmpleado, Empresa empresa, String nombreEmpleado, String correoEmpleado, Roles rolEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.perfil = perfil;
        this.empresa = empresa;
        this.transacciones = transacciones1;
        this.createdAt = createdAt1;
        this.updateAt = updateAt1;
    }

    public Empleado() {
    }

    //Getters and Setters

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public Roles getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(Roles rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Profile getPerfil() {
        return perfil;
    }

    public void setPerfil(Profile perfil) {
        this.perfil = perfil;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public MovimientoDinero getTransacciones() {
        return transacciones;
    }

    @Override
    public void setTransacciones(MovimientoDinero transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public Date getUpdateAt() {
        return updateAt;
    }

    @Override
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", empresa='" + empresa.getNombre() + '\'' +
                ", nombreDeEmpleado='" + nombreEmpleado + '\'' +
                ", correoEmpleado='" + correoEmpleado + '\'' +
                ", rolEmpleado=" + rolEmpleado +
                '}';
    }
}
