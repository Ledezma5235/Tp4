
import java.time.LocalDate;

public class Revistas extends Material{
    private int periodicidad;
    public int numedicion;
     public Revistas(String titulo,LocalDate fechadepublicacion, int idcod,int periodicidad, int numedicion){
         super(titulo, fechadepublicacion, idcod); this.periodicidad = periodicidad; this.numedicion = numedicion;
     }
}