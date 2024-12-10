package co.edu.uniempresarial.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniempresarial.model.historial;

import co.edu.uniempresarial.service.IhistorialService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


    @RestController
    public class historialController {
        //validaciones de campos expresiones regulares - clase validator
        
        @Autowired
        IhistorialService service;
        
        @GetMapping(value="historial")
        public List<historial> getAllhistorial() {
            return service.todashistorial();
        }
        
        @GetMapping(value="historial-id/{id}")
        public historial gethistorialById(@RequestParam("id")int id) {
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
        
    }
