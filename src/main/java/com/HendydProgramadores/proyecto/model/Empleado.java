package com.HendydProgramadores.proyecto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="employee")
public class Empleado{
    //Atributos
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;
    @Column(name="name")
    private String nombreEmpleado;
    @Column(name="phone")
    private String telefonoEmpleado;
    @Column(name="email")
    private String emailEmpleado;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_profile")
    private Profile perfil;

    @Enumerated(EnumType.STRING)
    @ElementCollection(targetClass = Role.class,fetch = FetchType.EAGER)
    @Column(name="enum_RoleName")
    private List<Role> rolesEmployee;

    @ManyToOne
    @JoinColumn(name="id_enterprise")
    private Empresa empresa;

    @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Transaccion> transacciones;

    @Column(name="createAt")
    private LocalDateTime createdAt;

    @Column(name="updateAt")
    private LocalDateTime updateAt;

}