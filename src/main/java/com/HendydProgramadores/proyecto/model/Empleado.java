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

    private Empresa empresa;

    //Constructor
    public Empleado(long idEmpleado, Empresa empresa, String nombreEmpleado, String correoEmpleado, Roles rolEmpleado) {
        this.idEmpleado = idEmpleado;
        this.empresa = empresa;
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
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
