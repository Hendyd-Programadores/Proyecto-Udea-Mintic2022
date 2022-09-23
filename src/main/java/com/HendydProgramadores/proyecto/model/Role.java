package com.HendydProgramadores.proyecto.model;

import javax.persistence.Table;

@Table(name="role")
public enum Role {
    admin, operario;
}
