package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.Tutor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class EstudianteDTO
{

    private int idEstudiante;

    private String nombreEstudiante;

    private LocalDate fechaNacimientoEstudiante;

    private String apPatEstudiante;

    private String apMatEstudiante;

    private String dniEstudiante;
    private Tutor tutor;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public LocalDate getFechaNacimientoEstudiante() {
        return fechaNacimientoEstudiante;
    }

    public void setFechaNacimientoEstudiante(LocalDate fechaNacimientoEstudiante) {
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
    }

    public String getApPatEstudiante() {
        return apPatEstudiante;
    }

    public void setApPatEstudiante(String apPatEstudiante) {
        this.apPatEstudiante = apPatEstudiante;
    }

    public String getApMatEstudiante() {
        return apMatEstudiante;
    }

    public void setApMatEstudiante(String apMatEstudiante) {
        this.apMatEstudiante = apMatEstudiante;
    }

    public String getDniEstudiante() {
        return dniEstudiante;
    }

    public void setDniEstudiante(String dniEstudiante) {
        this.dniEstudiante = dniEstudiante;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
