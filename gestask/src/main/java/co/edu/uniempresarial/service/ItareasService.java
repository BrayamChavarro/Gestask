package co.edu.uniempresarial.service;

import java.util.List;

import co.edu.uniempresarial.model.tareas;

public interface ItareasService {
	
	List<tareas> agregartareas(tareas tareas);
	tareas actualizartareas (tareas tareas);
	
	List<tareas> todastareas();
	tareas buscarIdtareas(int id);
	
	
	boolean bajatareas(int id);


}