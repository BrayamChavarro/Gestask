package co.edu.uniempresarial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniempresarial.model.tareas;
import co.edu.uniempresarial.service.ItareasService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin(origins = "*", maxAge = 3600) 
@RestController 
@RequestMapping({"/gestask"}) 
public class tareasController {
	//validaciones de campos expresiones regulares - clase validator
	
	@Autowired
	ItareasService service;
	
	@GetMapping(value="tareas")
	public List<tareas> getAlltareas() {
		return service.todastareas();
	}
	
	@GetMapping(value="tareas/{id}")
	public tareas gettareasById(@PathVariable int id) {
		return service.buscarIdtareas(id);
	}

	@PostMapping(value="tareas/add")
	public List<tareas> posttareas(@RequestBody tareas tareas){
		return service.agregartareas(tareas);
	}
	
	@PutMapping(value="tareas")
	public tareas puttareas(@RequestBody tareas tareas) {
		return service.actualizartareas(tareas);
	}
	
	@DeleteMapping(value = "/tareas/{id}")
	public ResponseEntity<String> deletetareas(@PathVariable int id) {
    boolean isDeleted = service.bajatareas(id);
    if (isDeleted) {
        return ResponseEntity.ok("Tarea eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tarea no encontrada.");
    }
}


    

                        
}
