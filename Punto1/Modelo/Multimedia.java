
import java.time.LocalDate;
public class Multimedia extends Material{

    private String formato;
    private int tamaño;
    public Multimedia(String titulo,LocalDate fechadepublicacion, int idcod, String formato, int tamaño){
         super(titulo,fechadepublicacion,idcod); this.formato = formato; this. tamaño = tamaño;
    }


}
