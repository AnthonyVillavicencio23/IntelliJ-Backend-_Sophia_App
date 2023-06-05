package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.CatCita;
import pe.edu.upc.sophia_app_backend.entities.Estado;
import pe.edu.upc.sophia_app_backend.entities.Estudiante;
import pe.edu.upc.sophia_app_backend.entities.Psicologo;

import java.time.LocalDate;

public class CitaDTO {

    private int idCita;
    private String disponibleCita;
    private LocalDate fechaCita;
    private String horaCita;
    private CatCita id;
    private Estudiante idEstudiante;
    private Psicologo idPsicologo;
    private Estado idEstado;

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getDisponibleCita() {
        return disponibleCita;
    }

    public void setDisponibleCita(String disponibleCita) {
        this.disponibleCita = disponibleCita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public CatCita getId() {
        return id;
    }

    public void setId(CatCita id) {
        this.id = id;
    }

    public Estudiante getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiante idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Psicologo getIdPsicologo() {
        return idPsicologo;
    }

    public void setIdPsicologo(Psicologo idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }
}
