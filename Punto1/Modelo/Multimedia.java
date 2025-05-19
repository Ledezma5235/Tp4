
import java.time.LocalDate;
import Tp4.Punto1.Modelo.Materiales;

public class Multimedia extends Materiales{

    private String formato;
    private int tamaño;
     public Multimedia(String titulo,LocalDate fechadepublicacion, int idcod, String formato, int tamaño){
         this.titulo = titulo; this.fechadepublicacion = fechadepublicacion; this.idcod = idcod; this.formato = formato; this. tamaño = tamaño;
     }


}
    