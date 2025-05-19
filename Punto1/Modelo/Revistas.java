public class Revistas extends Materiales{

    private int periodicidad;
    public int numedicion;
     public Multimedia(String titulo,LocalDate fechadepublicacion, int idcod,int periodicidad, int numedicion){
         this.titulo = titulo; this.fechadepublicacion = fechadepublicacion; this.idcod = idcod; this.periodicidad = periodicidad; this.numedicion = numedicion;
     }
}