package com.microusuario.microserviceusuario.models.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AdministradorEntity extends UsuarioEntity {
    private String adminCode;

}
