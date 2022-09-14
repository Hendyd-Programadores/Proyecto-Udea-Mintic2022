package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "Empleado")
public class Empleado extends Empresa{
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Atributos
    private Long idEmpleado;
    @ManyToOne
    @JoinColumn(name = "Empresa_id")
    private Empresa empresa;
    private String nombreEmpleado;
    private String correoEmpleado;
    @Enumerated(EnumType.STRING)
    @Column(name = "Rol")
    private Roles rolEmpleado;
    private Date createdAt;
    private Date updateAt;
    @OneToOne
    @JoinColumn(name = "Profile_id")
    private Profile perfil;
    @OneToMany
    @JoinColumn()
    private ArrayList<MovimientoDinero> transacciones;

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

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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

    public Profile getPerfil() {
        return perfil;
    }

    public void setPerfil(Profile perfil) {
        this.perfil = perfil;
    }

    @Override
    public ArrayList<MovimientoDinero> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<MovimientoDinero> transacciones) {
        this.transacciones = transacciones;
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