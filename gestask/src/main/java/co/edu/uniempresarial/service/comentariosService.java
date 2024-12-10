package co.edu.uniempresarial.service;
import java.util.List;
    
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniempresarial.model.comentarios;
import co.edu.uniempresarial.repository.Icomentarios;

@Service
    public class comentariosService implements IcomentariosService {
        
        //inyeccion de dependencias - repository
        @Autowired
        Icomentarios dao;
    
        @Override
        public List<comentarios> agregarcomentarios(comentarios comentarios) {
            return dao.addcomentarios(comentarios);
        }
    
        @Override
        public comentarios actualizarcomentarios(comentarios comentarios) {
            //busqueda del id a ver si existe
            return dao.uppcomentarios(comentarios);
        }
    
        @Override
        public List<comentarios> todascomentarios() {
            return dao.getAllcomentarios();
        }
    
        @Override
        public comentarios buscarIdcomentarios(int id) {
            return dao.getIdcomentarios(id);
        }

        @Override
        public boolean bajacomentarios(int id) {
            return dao.deletecomentarios(id);
        }
    
    }
