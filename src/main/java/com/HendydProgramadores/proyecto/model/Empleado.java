package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Empleado{
    //Atributos
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmpleado;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;



    private String nombreEmpleado;
    private String correoEmpleado;
    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Roles rolEmpleado;
    private Date createdAt;
    private Date updateAt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "perfil_id")
    private Profile perfil;

    @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<MovimientoDinero> transacciones;

    //Constructor
    public Empleado(Long idEmpleado, String nombreEmpleado, String correoEmpleado, Roles rolEmpleado, Date createdAt, Date updateAt, Empresa empresa, List<MovimientoDinero> transacciones, Profile perfil) {
        this.idEmpleado = idEmpleado;
        this.empresa = empresa;
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.perfil = perfil;
        this.transacciones = transacciones;
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

    public Profile getPerfil() {
        return perfil;
    }

    public void setPerfil(Profile perfil) {
        this.perfil = perfil;
    }

    public List<MovimientoDinero> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<MovimientoDinero> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", empresa=" + empresa +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correoEmpleado='" + correoEmpleado + '\'' +
                ", rolEmpleado=" + rolEmpleado +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                ", perfil=" + perfil +
                ", transacciones=" + transacciones +
                '}';
    }
}