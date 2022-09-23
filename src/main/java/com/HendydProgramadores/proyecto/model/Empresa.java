package com.HendydProgramadores.proyecto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="enterprise")
public class Empresa {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idEmpresa;

    @Column(name="name")
    private String nombre;

    @Column(name="document")
    private String nit;

    @Column(name="phone")
    private String telefono;

    @Column(name="address")
    private String direccion;

    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Empleado> usuarios;

    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Transaccion> Transaccion;

    @Column(name="createdAt")
    private Date createdAt;

    @Column(name="updateAt")
    private Date updateAt;

}
