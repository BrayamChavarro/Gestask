package co.edu.uniempresarial.repository;

import java.util.List;

import co.edu.uniempresarial.model.Mascota;

public interface IMascota {
	
	List<Mascota> addMascota(Mascota mascota);
	Mascota uppMascota (Mascota mascota);
	
	List<Mascota> getAllMascotas();
	Mascota getIdMascota(int id);
	
	boolean deleteMascota(int id);

}
