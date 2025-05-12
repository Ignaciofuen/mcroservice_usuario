import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdministradorController {
    private final AdministradorRepository administradorRepository;
    @Autowired
    private AdministradorService administradorService;
    AdministradorService  accionesAdministrador = new AdministradorService();

    AdministradorController(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }
    

    @GetMapping("/Estudiantes")
    public List<Estudiante>verEstudiantes(){
        return accionesAdministrador.obtenerEstudiantes();
    } 

    @GetMapping("/Instructores")
    public List<Instructores>verInstructores(){
        return accionesAdministrador.obtenerInstructores();
    }

    
    @GetMapping("Intructor-curso")
    public List<String>CursoInstructores(){
        return administradorService.instructoresConCurso();
    }
}
