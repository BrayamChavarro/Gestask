package co.edu.uniempresarial.model;

import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name="usuarios")
@NamedQuery(name="usuarios.findAll", query="SELECT m FROM usuarios m")
public class usuarios implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private int id_usuario;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="correo_electronico")
	private String correo_electronico;

	@Column(name="contrasena")
	private String contrasena;

	@Column(name="rol")
	private String rol;

	
	public usuarios() {
	}

	public int getId() {
		return id_usuario;
	}




	public void setId(int id) {
		this.id_usuario = id_usuario;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getCorreo_electronico() {
		return correo_electronico;
	}




	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}




	public String getContrasena() {
		return contrasena;
	}




	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}




	public String getRol() {
		return rol;
	}




	public void setRol(String rol) {
		this.rol = rol;
	}




}
