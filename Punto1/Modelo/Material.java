

import java.time.LocalDate;

public class Material {
   
    protected String titulo;
    protected LocalDate fechadepublicacion;
    protected int idcod;
    public Material(String titulo, LocalDate fechadepublicacion, int idcod) {
    this.titulo = titulo; this.fechadepublicacion = fechadepublicacion; this.idcod = idcod;    
    }
}
