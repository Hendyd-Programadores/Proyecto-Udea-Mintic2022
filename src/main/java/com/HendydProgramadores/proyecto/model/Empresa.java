package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="empresa")
public class Empresa {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue( strategy = GenerationType.AUTO)
    //Atributos
    private Long idEmpresa;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nit")
    private long nit;
    @Column(name = "teléfono")
    private int telefono;
    @Column(name = "dirección")
    private String direccion;
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Empleado> usuarios;
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<MovimientoDinero> transacciones;
    private Date createdAt;
    private Date updateAt;

    //Constructores
    public Empresa(Long idEmpresa, String nombre, long nit, int telefono, String direccion, List<Empleado> usuarios, List<MovimientoDinero> transacciones) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.usuarios = usuarios;
        this.transacciones = transacciones;
    }
    public Empresa() {
    }

    //Getters and Setters
    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
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

    public List<Empleado> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Empleado> usuarios) {
        this.usuarios = usuarios;
    }

    public List<MovimientoDinero> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<MovimientoDinero> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nombre='" + nombre + '\'' +
                ", nit=" + nit +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                ", usuarios=" + usuarios +
                ", transacciones=" + transacciones +
                '}';
    }
}
