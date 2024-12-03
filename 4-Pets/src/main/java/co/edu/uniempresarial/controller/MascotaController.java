package co.edu.uniempresarial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniempresarial.model.Mascota;
import co.edu.uniempresarial.service.IMascotaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="api")
public class MascotaController {
	//validaciones de campos expresiones regulares - clase validator
	
	@Autowired
	IMascotaService service;
	
	@GetMapping(value="pets")//endpoint
	public List<Mascota> getAllPets() {
		return service.todasMascotas();
	}
	
	@GetMapping(value="pets-id/{id}")
	public Mascota getPetById(@RequestParam("id")int id) {
		return service.buscarIdMascota(id);
	}
	
	@GetMapping(value="pets-vacum")
	public List<Mascota> getAllPetsVacum(){
		return service.vacunasMascotas();
	}
	
	@PostMapping(value="pets")
	public List<Mascota> postMascota(@RequestBody Mascota mascota){
		return service.agregarMascota(mascota);
	}
	
	@PutMapping(value="pets")
	public Mascota putMascota(@RequestBody Mascota mascota) {
		return service.actualizarMascota(mascota);
	}
	
	
	

}
