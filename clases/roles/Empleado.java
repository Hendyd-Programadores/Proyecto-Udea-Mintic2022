package clases.roles;

import clases.Persona;

public class Empleado extends Persona {
    private int idEmpleado;
    private double sueldoBruto;
    private String empresa;

    public Empleado(int id, String nombres, String correoElectronico, String nit, String direccion, String telefono, String whatsapp, int idEmpleado, double sueldoBruto, String empresa) {
        super(id, nombres, correoElectronico, nit, direccion, telefono, whatsapp);
        this.idEmpleado = idEmpleado;
        this.sueldoBruto = sueldoBruto;
        this.empresa = empresa;
    }

    public double calcularSalarioNeto(){
        // Falta agregarle los calculos
        return this.sueldoBruto;
    }

    public int getidEmpleado() {
        return idEmpleado;
    }

    public void setidEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    // El metodo mostrar se hereda de empleado


    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldoBruto=" + sueldoBruto +
                ", empresa='" + empresa + " ," +
                super.toString() +'\''+
                "} " ;
    }
}
