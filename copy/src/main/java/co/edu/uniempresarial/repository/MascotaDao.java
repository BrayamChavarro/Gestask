package co.edu.uniempresarial.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.uniempresarial.model.Mascota;

@Repository
public class MascotaDao implements IMascota {

	//inyeccion de dependencias por interface
	@Autowired
	IMascotaJpa jpa;
	
	@Override
	public List<Mascota> addMascota(Mascota mascota) {
		jpa.save(mascota);
		return getAllMascotas();
		
	}

	@Override
	public Mascota uppMascota(Mascota mascota) {
		return jpa.save(mascota);
	}

	@Override
	public List<Mascota> getAllMascotas() {
		return jpa.findAll();
	}

	@Override
	public Mascota getIdMascota(int id) {
		return jpa.findById(id).orElse(null);
	}

	@Override
	public boolean deleteMascota(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
