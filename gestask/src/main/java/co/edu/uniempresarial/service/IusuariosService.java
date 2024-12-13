package co.edu.uniempresarial.service;

import java.util.List;

import co.edu.uniempresarial.model.usuarios;

public interface IusuariosService {
	
	List<usuarios> agregarusuarios(usuarios usuarios);
	usuarios actualizarusuarios (usuarios usuarios);
	
	List<usuarios> todasusuarios();
	usuarios buscarIdusuarios(int id);
	
	
	boolean bajausuarios(int id);


}