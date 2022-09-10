package com.HendydProgramadores.proyecto.model;

public class Empleado extends Empresa{

    //Atributos
    private long idEmpleado;
    private String nombreEmpleado;
    private String correoEmpleado;
    private Roles rolEmpleado;

    //Constructor
    public Empleado(String nombre, String direccion, int telefono, long nit, long idEmpleado, String nombreEmpleado, String correoEmpleado, Roles rolEmpleado) {
        super(nombre, direccion, telefono, nit);
        this.idEmpleado = idEmpleado;
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
                ", nombreDeEmpleado='" + nombreEmpleado + '\'' +
                ", correoEmpleado='" + correoEmpleado + '\'' +
                ", rolEmpleado=" + rolEmpleado +
                '}';
    }
}
