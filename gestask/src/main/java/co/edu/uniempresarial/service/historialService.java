package co.edu.uniempresarial.service;
import java.util.List;
    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniempresarial.model.historial;
import co.edu.uniempresarial.repository.Ihistorial;

@Service
    public class historialService implements IhistorialService {
        
        //inyeccion de dependencias - repository
        @Autowired
        Ihistorial dao;
    
        @Override
        public List<historial> agregarhistorial(historial historial) {
            return dao.addhistorial(historial);
        }
    
        @Override
        public historial actualizarhistorial(historial historial) {
            //busqueda del id a ver si existe
            return dao.upphistorial(historial);
        }
    
        @Override
        public List<historial> todashistorial() {
            return dao.getAllhistorial();
        }
    
        @Override
        public historial buscarIdhistorial(int id) {
            return dao.getIdhistorial(id);
        }

        @Override
        public boolean bajahistorial(int id) {
            return dao.deletehistorial(id);
        }
    
    }
