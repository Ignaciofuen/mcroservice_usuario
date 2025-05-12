package com.microusuario.microserviceusuario.models.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class InstructorEntity extends UsuarioEntity  {
    private String cursoAsingnado;
    

}
