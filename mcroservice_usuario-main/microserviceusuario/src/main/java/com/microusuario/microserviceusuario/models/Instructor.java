package com.microusuario.microserviceusuario.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Instructor extends Usuario {

    private String cursoAsignado;

    public Instructor(String id, String run, String nombre, String apellido, String correo, String contraseña,
            String cursoAsignado) {
        super(id, run, nombre, apellido, correo, contraseña);
        this.cursoAsignado = cursoAsignado;
    }

    public Instructor(String cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }

    public String getCursoAsignado() {
        return cursoAsignado;
    }

    public void setCursoAsignado(String cursoAsignado) {
        this.cursoAsignado = cursoAsignado;
    }
    



}
