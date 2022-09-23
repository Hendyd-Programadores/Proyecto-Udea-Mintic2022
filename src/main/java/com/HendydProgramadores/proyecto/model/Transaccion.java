package com.HendydProgramadores.proyecto.model;
import javax.persistence.*;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name ="transaction")
public class Transaccion {
    //Atributos
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long idTransaccion;

    @Column(name="cencept")
    private String concepto;

    @Column(name="amount")
    private float monto;

    @Column(name="createdAt")
    private LocalDateTime createdAt;

    @Column(name="updateAt")
    private LocalDateTime updateAt;

    @ManyToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_Empresa")
    private Empresa empresa;

}
