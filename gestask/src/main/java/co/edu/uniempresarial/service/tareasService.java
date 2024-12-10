package co.edu.uniempresarial.service;

import co.edu.uniempresarial.model.tareas;
import co.edu.uniempresarial.repository.Itareas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class tareasService implements ItareasService{

    @Autowired
    Itareas dao;

    @Override
    public List<tareas> agregartareas(tareas tareas) {
        
        return dao.addtareas(tareas);
    }

    @Override
    public tareas actualizartareas(tareas tareas) {
       return dao.upptareas(tareas);
    }

    @Override
    public List<tareas> todastareas() {
        return  dao.getAlltareas();
    }

    @Override
    public tareas buscarIdtareas(int id) {
         return dao.getIdtareas(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean bajatareas(int id) {
         return dao.deletetareas(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	
}
