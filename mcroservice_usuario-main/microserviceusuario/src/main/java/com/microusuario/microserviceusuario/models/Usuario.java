package com.microusuario.microserviceusuario.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    protected String id;
    protected String run;
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String contraseña;
    
  




}
