package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "estudiantes")
public class Estudiante
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;

    @Column(name = "nombreEstudiante",length = 40,nullable = false)
    private String nombreEstudiante;

    @Column(name = "fechaNacimientoEstudiante", nullable = false)
    private LocalDate fechaNacimientoEstudiante;

    @Column(name = "apellidoPatEstudiante",length = 40,nullable = false)
    private String apellidoPatEstudiante;

    @Column(name = "apellidoMatEstudiante",length = 40,nullable = false)
    private String apellidoMatEstudiante;

    @Column(name = "dniEstudiante",length = 8,nullable = false)
    private String dniEstudiante;

    @ManyToOne
    @JoinColumn(name = "idTutor")
    private Tutor idTutor;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombreEstudiante, LocalDate fechaNacimientoEstudiante, String apellidoPatEstudiante, String apellidoMatEstudiante, String dniEstudiante, Tutor idTutor) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
        this.apellidoPatEstudiante = apellidoPatEstudiante;
        this.apellidoMatEstudiante = apellidoMatEstudiante;
        this.dniEstudiante = dniEstudiante;
        this.idTutor = idTutor;
    }

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
