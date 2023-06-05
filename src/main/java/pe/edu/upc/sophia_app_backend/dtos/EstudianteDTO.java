package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.Tutor;

import java.time.LocalDate;

public class EstudianteDTO
{

    private int idEstudiante;
    private String nombreEstudiante;
    private LocalDate fechaNacimientoEstudiante;
    private String apellidoPatEstudiante;
    private String apellidoMatEstudiante;
    private String dniEstudiante;
    private Tutor idTutor;

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

    public String getApellidoPatEstudiante() {
        return apellidoPatEstudiante;
    }

    public void setApellidoPatEstudiante(String apellidoPatEstudiante) {
        this.apellidoPatEstudiante = apellidoPatEstudiante;
    }

    public String getApellidoMatEstudiante() {
        return apellidoMatEstudiante;
    }

    public void setApellidoMatEstudiante(String apellidoMatEstudiante) {
        this.apellidoMatEstudiante = apellidoMatEstudiante;
    }

    public String getDniEstudiante() {
        return dniEstudiante;
    }

    public void setDniEstudiante(String dniEstudiante) {
        this.dniEstudiante = dniEstudiante;
    }

    public Tutor getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(Tutor idTutor) {
        this.idTutor = idTutor;
    }
}
