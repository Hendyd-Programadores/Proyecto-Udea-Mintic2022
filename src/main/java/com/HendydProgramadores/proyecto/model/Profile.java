package com.HendydProgramadores.proyecto.model;

import javax.persistence.*;
import java.util.Date;

//@Entity
public class Profile {

    //Atributos
    /*
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)

     */
    private String id;
    private String imagen;
    private String telefono;
    /*
    @OneToOne
    @JoinColumn(name = "Empleado_Id")

     */
    private Empleado usuario;
    private Date createAt;
    private Date updateAt;

    //Constructor
    public Profile(String id, String imagen, String telefono, Empleado usuario, Date createAt, Date updateAt) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
        this.usuario = usuario;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }
    public Profile() {
    }

    //Getter and Setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
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