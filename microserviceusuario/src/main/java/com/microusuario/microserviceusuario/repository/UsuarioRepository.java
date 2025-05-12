package com.microusuario.microserviceusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microusuario.microserviceusuario.models.entity.UsuarioEntity;
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity,String>{
    UsuarioEntity findByCorreo(String correo);
    Boolean existsByCorreo(String correo);
    void deleteByCorreo(String correo);
    
    // save 
    //findAll

}  

    

