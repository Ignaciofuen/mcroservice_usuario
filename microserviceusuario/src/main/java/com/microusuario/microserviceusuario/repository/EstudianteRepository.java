package com.microusuario.microserviceusuario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microusuario.microserviceusuario.models.entity.EstudianteEntity;

@Repository
public interface EstudianteRepository extends JpaRepository<EstudianteEntity, String> {

    EstudianteEntity findByCorreo(String correo);
    boolean existsByCorreo(String correo);
}

   
