package co.edu.uniempresarial.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uniempresarial.model.comentarios;
import co.edu.uniempresarial.service.IcomentariosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


    @RestController
    public class comentariosController {
        //validaciones de campos expresiones regulares - clase validator
        
        @Autowired
        IcomentariosService service;
        
        @GetMapping(value="comentarios")
        public List<comentarios> getAllcomentarios() {
            return service.todascomentarios();
        }
        
        @GetMapping(value="comentarios-id/{id}")
        public comentarios getcomentariosById(@RequestParam("id")int id) {
            return service.buscarIdcomentarios(id);
        }
    
        @PostMapping(value="comentarios")
        public List<comentarios> postcomentarios(@RequestBody comentarios comentarios){
            return service.agregarcomentarios(comentarios);
        }
        
        @PutMapping(value="comentarios")
        public comentarios putcomentarios(@RequestBody comentarios comentarios) {
            return service.actualizarcomentarios(comentarios);
        }
           @DeleteMapping(value = "/historial/{id}")
	public ResponseEntity<String> deletecomentarios(@PathVariable int id) {
    boolean isDeleted = service.bajacomentarios(id);
    if (isDeleted) {
        return ResponseEntity.ok("Historial eliminado correctamente.");
    }else {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("historial no encontrado.");
    }
    }
    }
