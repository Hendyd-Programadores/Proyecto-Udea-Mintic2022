package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Profile {

    //Atributos
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "contraseña")
    private String contraseña;
    @OneToOne(mappedBy = "perfil", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Empleado empleado;
    private Date createAt;
    private Date updateAt;

    //Constructor
    public Profile(Long id, String usuario, String contraseña, Empleado empleado, Date createAt, Date updateAt) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.empleado = empleado;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Profile() {
    }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}