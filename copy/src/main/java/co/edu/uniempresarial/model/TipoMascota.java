package co.edu.uniempresarial.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_mascota database table.
 * 
 */
@Entity
@Table(name="tipo_mascota")
@NamedQuery(name="TipoMascota.findAll", query="SELECT t FROM TipoMascota t")
public class TipoMascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tip_id")
	private int tipId;

	@Column(name="tip_descripcion")
	private String tipDescripcion;

	

	public TipoMascota() {
	}

	public int getTipId() {
		return this.tipId;
	}

	public void setTipId(int tipId) {
		this.tipId = tipId;
	}

	public String getTipDescripcion() {
		return this.tipDescripcion;
	}

	public void setTipDescripcion(String tipDescripcion) {
		this.tipDescripcion = tipDescripcion;
	}

	

}