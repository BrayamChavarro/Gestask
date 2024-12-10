package co.edu.uniempresarial.model;
import java.io.Serializable;
import jakarta.persistence.*;



    @Entity
    @Table(name="historial")
    @NamedQuery(name="historial.findAll", query="SELECT m FROM historial m")
    public class historial implements Serializable  {

        private static final long serialVersionUID = 1L;
    
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="id")
        private int id;
        
        @Column(name="id_tarea")
        private String id_tarea;
    
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

        @Column(name="fecha_entrega")
        private String fecha_entrega;
        
        @Column(name="id_usuario")
        private String id_usuario;
        
    
        
        public historial() {
        }
    
        public int getid() {
            return this.id;
        }
    
        public void setid(int id) {
            this.id = id;
        }
    
        public String getid_tarea() {
            return this.id_tarea;
        }
    
        public void setid_tarea(String id_tarea) {
            this.id_tarea = id_tarea;
        }
    
        public String getnombre_tarea() {
            return this.nombre_tarea;
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
            this.id_usuario = fecha_inicio;
        }
        
        public String getfecha_vencimiento() {
            return this.fecha_vencimiento;
        }
    
        public void setfecha_vencimiento(String fecha_vencimiento) {
            this.id_usuario = fecha_vencimiento;

        }

        public String getfecha_entrega() {
            return this.fecha_entrega;
        }
    
        public void setfecha_entrega(String fecha_entrega) {
            this.fecha_entrega = fecha_entrega;
        }

        public String getid_usuario() {
            return this.id_usuario;
        }
    
        public void setid_usuario(String id_usuario) {
            this.id_usuario = id_usuario;
        }
    
    
    
        
    
    
}
