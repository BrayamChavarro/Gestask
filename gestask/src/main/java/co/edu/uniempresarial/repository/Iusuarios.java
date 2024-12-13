package co.edu.uniempresarial.repository;

import java.util.List;

import co.edu.uniempresarial.model.usuarios;

public interface Iusuarios {
	
	List<usuarios> addusuarios(usuarios usuarios);
	usuarios uppusuarios (usuarios usuarios);
	
	List<usuarios> getAllusuarios();
	usuarios getIdusuarios(int id);
	
	boolean deleteusuarios(int id);


}
