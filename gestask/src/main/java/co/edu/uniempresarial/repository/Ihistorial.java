package co.edu.uniempresarial.repository;

import java.util.List;

import co.edu.uniempresarial.model.historial;

public interface Ihistorial {
List<historial> addhistorial(historial historial);
	historial upphistorial (historial historial);
	
	List<historial> getAllhistorial();
	historial getIdhistorial(int id);
	
	boolean deletehistorial(int id);

}
