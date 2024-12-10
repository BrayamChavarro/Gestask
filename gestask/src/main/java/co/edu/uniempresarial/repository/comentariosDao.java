package co.edu.uniempresarial.repository;
import java.util.List;
    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.uniempresarial.model.comentarios;

    
@Repository
public class comentariosDao implements Icomentarios {
    
        //inyeccion de dependencias por interface
        @Autowired
        IcomentariosJpa jpa;
        
        
        @Override
        public List<comentarios> addcomentarios(comentarios comentarios) {
            jpa.save(comentarios);
            return getAllcomentarios();
            
        }
    
        @Override
        public comentarios uppcomentarios(comentarios comentarios) {
            return jpa.save(comentarios);
        }
    
        @Override
        public List<comentarios> getAllcomentarios() {
            return jpa.findAll();
        }
    
        @Override
        public comentarios getIdcomentarios(int id) {
            return jpa.findById(id).orElse(null);
        }
    
        @Override
        public boolean deletecomentarios(int id) {
            if (jpa.existsById(id)) {
                jpa.deleteById(id);
                return true;
            }
            return false;
         }
    
    }
    
