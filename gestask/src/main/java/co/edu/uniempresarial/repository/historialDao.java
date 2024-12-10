package co.edu.uniempresarial.repository;
import java.util.List;
    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.uniempresarial.model.historial;

@Repository
public class historialDao implements Ihistorial {
    
        //inyeccion de dependencias por interface
        @Autowired
        IhistorialJpa jpa;
        
        
        @Override
        public List<historial> addhistorial(historial historial) {
            jpa.save(historial);
            return getAllhistorial();
            
        }
    
        @Override
        public historial upphistorial(historial historial) {
            return jpa.save(historial);
        }
    
        @Override
        public List<historial> getAllhistorial() {
            return jpa.findAll();
        }
    
        @Override
        public historial getIdhistorial(int id) {
            return jpa.findById(id).orElse(null);
        }
    
        @Override
        public boolean deletehistorial(int id) {
            if (jpa.existsById(id)) {
                jpa.deleteById(id);
                return true;
            }
            return false;
         }
    
    }
