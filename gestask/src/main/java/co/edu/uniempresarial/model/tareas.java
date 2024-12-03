package co.edu.uniempresarial.model;

import java.io.Serializable;
import jakarta.persistence.*;


@Entity
@Table(name="tareas")
@NamedQuery(name="tareas.findAll", query="SELECT m FROM tareas m")
public class tareas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre_tarea")
	private String nombre_tarea;

	@Column(name="descripcion")
	private String descripcion;

	@Column(name="estado")
	private String estado;

	@Column(name="fecha_inicio")
	private String fecha_inicio;

	@Column(name="fecha_vencimiento")
	private String fecha_vencimiento;

	@Column(name="id_usuario")
	private int id_usuario;





	public tareas() {
	}

	public int getid() {
		return this.id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getnombre_tarea() {
		return this.nombre_tarea;
	}

	public void setnombre_tarea(String nombre_tarea) {
		this.nombre_tarea = nombre_tarea;
	}

	public String getdescripcion() {
		return this.descripcion;
	}

	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getestado() {
		return this.estado;
	}

	public void setestado(String estado) {
		this.estado = estado;
	}

	public String getfecha_inicio() {
		return this.fecha_inicio;
	}

	public void setfecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public String getfecha_vencimiento() {
		return this.fecha_vencimiento;
	}

	public void setfecha_vencimiento(String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	

}