package co.edu.uniempresarial.service;
import java.util.List;

import co.edu.uniempresarial.model.comentarios;
public interface IcomentariosService {
    List<comentarios> agregarcomentarios(comentarios comentarios );
	comentarios actualizarcomentarios (comentarios comentarios);
	
	List<comentarios> todascomentarios();
	comentarios buscarIdcomentarios(int id);
	
	
	boolean bajacomentarios(int id);

}

