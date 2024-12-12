package co.edu.uniempresarial.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniempresarial.model.historial;

import co.edu.uniempresarial.service.IhistorialService;

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
    public class historialController {
        //validaciones de campos expresiones regulares - clase validator
        
        @Autowired
        IhistorialService service;
        
        @GetMapping(value="historial")
        public List<historial> getAllhistorial() {
            return service.todashistorial();
        }
        
        @GetMapping(value="historial/{id}")
        public historial gethistorialById(@PathVariable int id) {
            return service.buscarIdhistorial(id);
        }
        @PostMapping(value="historial")
	    public List<historial> posthistorial(@RequestBody historial historial){
		return service.agregarhistorial(historial);
	    }
        
        @PutMapping(value="historial")
        public historial puthistorial(@RequestBody historial historial) {
            return service.actualizarhistorial(historial);
        }
        
        
        @DeleteMapping(value = "/historial/{id}")
	public ResponseEntity<String> deletehistorial(@PathVariable int id) {
    boolean isDeleted = service.bajahistorial(id);
    if (isDeleted) {
        return ResponseEntity.ok("Historial eliminado correctamente.");
    }else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("historial no encontrado.");
    }
    }




}



    
