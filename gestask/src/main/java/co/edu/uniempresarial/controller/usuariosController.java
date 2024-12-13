package co.edu.uniempresarial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniempresarial.model.usuarios;
import co.edu.uniempresarial.service.IusuariosService;

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
public class usuariosController {
	//validaciones de campos expresiones regulares - clase validator
	
	@Autowired
	IusuariosService service;
	
	@GetMapping(value="usuarios")
	public List<usuarios> getAllusuarios() {
		return service.todasusuarios();
	}
	
	@GetMapping(value="usuarios/{id}")
	public usuarios gettareasById(@PathVariable int id) {
		return service.buscarIdusuarios(id);
	}

	@PostMapping(value="usuarios/add")
	public List<usuarios> postusuarios(@RequestBody usuarios usuarios){
		return service.agregarusuarios(usuarios);
	}
	
	@PutMapping(value="usuarios")
	public usuarios putusuarios(@RequestBody usuarios usuarios) {
		return service.actualizarusuarios(usuarios);
	}
	
	@DeleteMapping(value = "/usuarios/{id}")
	public ResponseEntity<String> deleteusuarios(@PathVariable int id) {
    boolean isDeleted = service.bajausuarios(id);
    if (isDeleted) {
        return ResponseEntity.ok("Tarea eliminada correctamente.");
    } else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tarea no encontrada.");
    }
}


    

                        
}
