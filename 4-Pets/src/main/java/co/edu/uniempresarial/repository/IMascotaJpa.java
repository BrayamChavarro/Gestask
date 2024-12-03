package co.edu.uniempresarial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uniempresarial.model.Mascota;

public interface IMascotaJpa extends JpaRepository<Mascota, Integer> {

}
