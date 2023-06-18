package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.Modulo;

public class videoClaseDTO {
    private int idVideoClase;
    private String descripcion;
    private String nombreVideo;
    private int duracionVideo;
    private Modulo modulo;

    public int getIdVideoClase() {
        return idVideoClase;
    }

    public void setIdVideoClase(int idVideoClase) {
        this.idVideoClase = idVideoClase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreVideo() {
        return nombreVideo;
    }

    public void setNombreVideo(String nombreVideo) {
        this.nombreVideo = nombreVideo;
    }

    public int getDuracionVideo() {
        return duracionVideo;
    }

    public void setDuracionVideo(int duracionVideo) {
        this.duracionVideo = duracionVideo;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
