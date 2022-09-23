package com.HendydProgramadores.proyecto.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="profile")
public class Profile {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image")
    private String imagen;

    @Column(name = "phone")
    private String telefono;

    @OneToOne(mappedBy = "perfil",cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Empleado empleado;

    @Column(name = "createAt")
    private LocalDateTime createAt;
    @Column(name = "updateAt")
    private LocalDateTime updateAt;

}