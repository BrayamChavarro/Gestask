package co.edu.uniempresarial.model;
import java.io.Serializable;
import jakarta.persistence.*;



    @Entity
    @Table(name="comentario")
    @NamedQuery(name="comentarios.findAll", query="SELECT m FROM comentarios m")
    public class comentarios implements Serializable  {

        private static final long serialVersionUID = 1L;
    
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="id")
        private int id;
        
        @Column(name="texto")
        private String texto;
    
        @Column(name="fecha_creacion")
        private String fecha_creacion;
    
        @Column(name="id_tarea")
        private String id_tarea;
    
        @Column(name="id_usuario")
        private String id_usuario;
    
    
        public comentarios() {
        }
    
        public int getid() {
            return this.id;
        }
    
        public void setid(int id) {
            this.id = id;
        }
    
        public String gettexto() {
            return this.texto;
        }
    
        public void settexto(String texto) {
            this.texto = texto;
        }
    
        public String getfecha_creacion() {
            return this.fecha_creacion;
        }
       
        public void setfecha_creacion(String fecha_creacion) {
            this.fecha_creacion = fecha_creacion;
        }
        public String getid_tarea() {
            return this.id_tarea;
        }    

        public void setid_tarea(String id_tarea) {
            this.id_tarea = id_tarea;
        }
    
        public String getid_usuario() {
            return this.id_usuario;
        }
    
        public void setid_usuarios(String id_usuario) {
            this.id_usuario = id_usuario;
        }
    
        
    
    
}
