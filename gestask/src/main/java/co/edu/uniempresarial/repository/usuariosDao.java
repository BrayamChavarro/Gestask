package co.edu.uniempresarial.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.edu.uniempresarial.model.usuarios;

@Repository
public class usuariosDao implements Iusuarios {

	//inyeccion de dependencias por interface
	@Autowired
	IusuariosJpa jpa;
	private final Logger log = LoggerFactory.getLogger(usuariosDao.class);

	
        @Override
	public List<usuarios> addusuarios(usuarios usuarios) {
		jpa.save(usuarios);
		return getAllusuarios();
		
	}

	@Override
	public usuarios uppusuarios(usuarios usuarios) {
		return jpa.save(usuarios);
	}

	@Override
	public List<usuarios> getAllusuarios() {
		return jpa.findAll();
	}

	@Override
	public usuarios getIdusuarios(int id) {
    return jpa.findById(id)
            .orElseThrow(() -> new RuntimeException("usuariosno encontrada con id " + id));
}

	@Override
	public boolean deleteusuarios(int id) {
    if (jpa.existsById(id)) {
        jpa.deleteById(id);
        return true;
    }
    return false;
}


}
