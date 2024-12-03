package co.edu.uniempresarial.repository;

import java.util.List;

import co.edu.uniempresarial.model.tareas;

public interface Itareas {
	
	List<tareas> addtareas(tareas tareas);
	tareas upptareas (tareas tareas);
	
	List<tareas> getAlltareas();
	tareas getIdtareas(int id);
	
	boolean deletetareas(int id);

}
