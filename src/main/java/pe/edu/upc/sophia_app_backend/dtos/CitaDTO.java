package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.CatCita;
import pe.edu.upc.sophia_app_backend.entities.Estado;
import pe.edu.upc.sophia_app_backend.entities.Estudiante;
import pe.edu.upc.sophia_app_backend.entities.Psicologo;

import java.time.LocalDate;

public class CitaDTO {

    private int idCita;
    private String disponible;
    private LocalDate fecha;
    private String hora;
    private CatCita catCita;
    private Estudiante estudiante;
    private Psicologo psicologo;
    private Estado estado;

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public CatCita getCatCita() {
        return catCita;
    }

    public void setCatCita(CatCita catCita) {
        this.catCita = catCita;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
