package Tp4.Punto1;

import java.time.LocalDate;

public class ABM_eventos {
    
private String cod_evento;
private String nombre;
private LocalDate fecha_incio;
private LocalDate fecha_fin;
private String lugar;
private LocalDate horario_incio;
private LocalDate horario_fin;
private int cupo;
    private String descripcion;
    private String organizador;
    private String telefono;
    private String email;

    public ABM_eventos(String cod_evento, String nombre, LocalDate fecha_incio, LocalDate fecha_fin, String lugar,
               LocalDate horario_incio, LocalDate horario_fin, int cupo, String descripcion, String organizador,
               String telefono, String email) {
        this.cod_evento = cod_evento;
        this.nombre = nombre;
        this.fecha_incio = fecha_incio;
        this.fecha_fin = fecha_fin;
        this.lugar = lugar;
        this.horario_incio = horario_incio;
        this.horario_fin = horario_fin;
        this.cupo = cupo;
        this.descripcion = descripcion;
        this.organizador = organizador;
        this.telefono = telefono;
        this.email = email;
    }
}