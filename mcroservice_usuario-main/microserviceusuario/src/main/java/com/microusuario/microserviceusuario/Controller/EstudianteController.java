package com.microusuario.microserviceusuario.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microusuario.microserviceusuario.models.Estudiante;
import com.microusuario.microserviceusuario.models.Usuario;
import com.microusuario.microserviceusuario.models.entity.EstudianteEntity;
import com.microusuario.microserviceusuario.repository.EstudianteRepository;
import com.microusuario.microserviceusuario.repository.UsuarioRepository;
import com.microusuario.microserviceusuario.service.EstudianteService;


@RestController
public class EstudianteController{
    private final EstudianteRepository estudianteRepository;
    @Autowired
    private EstudianteService estudianteService;
    EstudianteService accionesEstudiante = new EstudianteService();

    EstudianteController(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }


    @GetMapping("/estudiantes/{correo}")
    public ResponseEntity<Estudiante>traerEstudiante(@PathVariable String correo){
        return ResponseEntity.ok(estudianteService.traerEstudiante(correo));
    }
    
    @PostMapping("/agregar")
    public ResponseEntity<String> agregarEstudiante(@RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(estudianteService.agregarEstudiante(estudiante));
    }

    
    @GetMapping("/inscribir/{correo}/{nuevoCurso}")
    public String inscribirCurso(@PathVariable String correo,@PathVariable String neuvoCurso){
        return estudianteService.inscribirCurso(correo, neuvoCurso);
    }    

}
