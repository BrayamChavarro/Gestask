package co.edu.uniempresarial.service;

import java.util.List;

import co.edu.uniempresarial.model.Mascota;

public interface IMascotaService {
	
	List<Mascota> agregarMascota(Mascota mascota);
	Mascota actualizarMascota (Mascota mascota);
	
	List<Mascota> todasMascotas();
	Mascota buscarIdMascota(int id);
	List<Mascota> vacunasMascotas();
	
	boolean bajaMascota(int id);


}
