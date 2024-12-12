package co.edu.uniempresarial.repository;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.uniempresarial.model.historial;
import co.edu.uniempresarial.model.tareas;

@Repository
public class historialDao implements Ihistorial {
    
        //inyeccion de dependencias por interface
        @Autowired
        IhistorialJpa jpa;
        private final Logger log = LoggerFactory.getLogger(historialDao.class);

        
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
        return jpa.findById(id)
            .orElseThrow(() -> new RuntimeException("Historial no encontrada con id " + id));
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
