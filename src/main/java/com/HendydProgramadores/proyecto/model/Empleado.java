package com.HendydProgramadores.proyecto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name = "Empleado")
public class Empleado {
    //Atributos
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmpleado;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
    @Column(name = "nombre")
    private String nombreEmpleado;
    @Column(name = "correo")
    private String correoEmpleado;
    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Roles rolEmpleado;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "perfil_id")
    private Profile perfil;
    @OneToMany(mappedBy = "empleado", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MovimientoDinero> transacciones;
    private Date createdAt;
    private Date updateAt;

    //Constructores
    public Empleado(Long idEmpleado, Empresa empresa, String nombreEmpleado, String correoEmpleado, Roles rolEmpleado, List<MovimientoDinero> transacciones) {
        this.idEmpleado = idEmpleado;
        this.empresa = empresa;
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.rolEmpleado = rolEmpleado;
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
                ", perfil=" + perfil +
                ", transacciones=" + transacciones +
                '}';
    }
}