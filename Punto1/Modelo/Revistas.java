import java.time.LocalDate;

public class Revistas extends Material{
    private int periodicidad;
    public int numedicion;
     public Revistas(String titulo,LocalDate fechadepublicacion, int idcod,int periodicidad, int numedicion){
         this.titulo = titulo; this.fechadepublicacion = fechadepublicacion; this.idcod = idcod; this.periodicidad = periodicidad; this.numedicion = numedicion;
     }
}