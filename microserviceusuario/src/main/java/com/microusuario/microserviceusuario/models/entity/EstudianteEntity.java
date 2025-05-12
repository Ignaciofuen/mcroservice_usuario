package com.microusuario.microserviceusuario.models.entity;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class EstudianteEntity extends UsuarioEntity{
    private String cursoInscrito;


    
}
