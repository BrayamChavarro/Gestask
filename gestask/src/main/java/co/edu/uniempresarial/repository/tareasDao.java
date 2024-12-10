package co.edu.uniempresarial.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.uniempresarial.model.tareas;

@Repository
public class tareasDao implements Itareas {

	//inyeccion de dependencias por interface
	@Autowired
	ItareasJpa jpa;
	
	
        @Override
	public List<tareas> addtareas(tareas tareas) {
		jpa.save(tareas);
		return getAlltareas();
		
	}

	@Override
	public tareas upptareas(tareas tareas) {
		return jpa.save(tareas);
	}

	@Override
	public List<tareas> getAlltareas() {
		return jpa.findAll();
	}

	@Override
	public tareas getIdtareas(int id) {
		return jpa.findById(id).orElse(null);
	}

	@Override
	public boolean deletetareas(int id) {
    if (jpa.existsById(id)) {
        jpa.deleteById(id);
        return true;
    }
    return false;
}


}
