package co.edu.uniempresarial.service;
import java.util.List;

import co.edu.uniempresarial.model.historial;
public interface IhistorialService {
    List<historial> agregarhistorial(historial historial );
	historial actualizarhistorial (historial  historial );
	
	List<historial> todashistorial();
	historial buscarIdhistorial(int id);
	
	
	boolean bajahistorial(int id);

}
