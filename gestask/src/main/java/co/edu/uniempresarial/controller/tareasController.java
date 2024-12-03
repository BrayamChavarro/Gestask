package co.edu.uniempresarial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniempresarial.model.tareas;
import co.edu.uniempresarial.service.ItareasService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class tareasController {
	//validaciones de campos expresiones regulares - clase validator
	
	@Autowired
	ItareasService service;
	
	@GetMapping(value="tareas")//endpoint
	public List<tareas> getAlltareas() {
		return service.todastareas();
	}
	
	/*@GetMapping(value="gestask-id/{id}")
	public tareas gettareasById(@RequestParam("id")int id) {
		return service.buscarIdtareas(id);
	}

	@PostMapping(value="gestask")
	public List<tareas> posttareas(@RequestBody tareas tareas){
		return service.agregartareas(tareas);
	}
	
	@PutMapping(value="gestask")
	public tareas puttareas(@RequestBody tareas tareas) {
		return service.actualizartareas(tareas);
	}
	*/
	
	

}
