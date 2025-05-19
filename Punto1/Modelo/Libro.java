
import java.time.LocalDate;
import Tp4.Punto1.Modelo.Materiales;

public class Libro extends Materiales{
    private String autor;
    private int numpags;
    public Libro(String titulo,LocalDate fechadepublicacion, int idcod, String autor, int numpags){
        this.titulo = titulo; this.fechadepublicacion = fechadepublicacion; this.idcod = idcod; this.autor = autor; this.numpags = numpags;
    }
}