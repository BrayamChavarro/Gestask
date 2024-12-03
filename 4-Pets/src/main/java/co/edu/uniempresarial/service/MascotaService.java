package co.edu.uniempresarial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.uniempresarial.model.Mascota;
import co.edu.uniempresarial.repository.IMascota;

@Service
public class MascotaService implements IMascotaService {
	
	//inyeccion de dependencias - repository
	@Autowired
	IMascota dao;

	@Override
	public List<Mascota> agregarMascota(Mascota mascota) {
		return dao.addMascota(mascota);
	}

	@Override
	public Mascota actualizarMascota(Mascota mascota) {
		//busqueda del id a ver si existe
		return dao.uppMascota(mascota);
	}

	@Override
	public List<Mascota> todasMascotas() {
		return dao.getAllMascotas();
	}

	@Override
	public Mascota buscarIdMascota(int id) {
		return dao.getIdMascota(id);
	}

	@Override
	public List<Mascota> vacunasMascotas() {
		List<Mascota> listVacunas = dao.getAllMascotas();
		return listVacunas.stream().filter(i -> i.getMasEdad()>5).toList();
	}

	@Override
	public boolean bajaMascota(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
