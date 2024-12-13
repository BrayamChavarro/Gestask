package co.edu.uniempresarial.service;

import co.edu.uniempresarial.model.usuarios;
import co.edu.uniempresarial.repository.Iusuarios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class usuariosService implements IusuariosService{

    @Autowired
    Iusuarios dao;

    @Override
    public List<usuarios> agregarusuarios(usuarios usuarios) {
        
        return dao.addusuarios(usuarios);
    }

    @Override
    public usuarios actualizarusuarios(usuarios usuarios) {
       return dao.uppusuarios(usuarios);
    }

    @Override
    public List<usuarios> todasusuarios() {
        return  dao.getAllusuarios();
    }

    @Override
    public usuarios buscarIdusuarios(int id) {
         return dao.getIdusuarios(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean bajausuarios(int id) {
         return dao.deleteusuarios(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
	
	
}
