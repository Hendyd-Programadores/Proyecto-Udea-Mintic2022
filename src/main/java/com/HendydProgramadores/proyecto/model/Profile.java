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
    private String imagen;
    private String telefono;

    @OneToOne(mappedBy = "perfil", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Empleado empleado;

    private Date createAt;
    private Date updateAt;

    //Constructor
    public Profile(Long id, String imagen, String telefono, Date createAt, Date updateAt,Empleado empleado) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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