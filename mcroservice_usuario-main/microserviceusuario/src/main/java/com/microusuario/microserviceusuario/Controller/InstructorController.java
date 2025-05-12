package com.microusuario.microserviceusuario.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microusuario.microserviceusuario.models.Estudiante;
import com.microusuario.microserviceusuario.models.Instructor;
import com.microusuario.microserviceusuario.repository.InstructorRepository;
import com.microusuario.microserviceusuario.service.InstructorService;

@RestController
public class InstructorController {
    private final InstructorRepository instructorRepository;
    @Autowired
    private InstructorService instructorService;
    InstructorService accionesInstructor = new InstructorService();

    
    InstructorController(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    @PostMapping("/agregarInstructor")
    public ResponseEntity<String> agregarInstructor(@RequestBody Instructor instructor) {
        return ResponseEntity.ok(instructorService.agregarInstructor(instructor));
    }

    



}
