package co.edu.uniempresarial.service;

import co.edu.uniempresarial.model.tareas;
import co.edu.uniempresarial.repository.Itareas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class tareasService implements ItareasService{

    @Autowired
    Itareas task;

    @Override
    public List<tareas> agregartareas(tareas tareas) {
        
        return task.addtareas(tareas);
    }

    @Override
    public tareas actualizartareas(tareas tareas) {
       return null;
    }

    @Override
    public List<tareas> todastareas() {
        return  task.getAlltareas();
    }

    @Override
    public tareas buscarIdtareas(int id) {
         return null; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean bajatareas(int id) {
         return false; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	
}
