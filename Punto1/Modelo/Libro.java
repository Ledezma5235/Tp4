
import java.time.LocalDate;

public class Libro extends Material{
    private String autor;
    private int numpags;
    public Libro(String titulo,LocalDate fechadepublicacion, int idcod, String autor, int numpags){
       super(titulo, fechadepublicacion, idcod);this.autor = autor; this.numpags = numpags;
    }
}