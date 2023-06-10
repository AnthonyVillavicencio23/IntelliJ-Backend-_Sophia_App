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

    @Column(name = "apPatEstudiante",length = 40,nullable = false)
    private String apPatEstudiante;

    @Column(name = "apMatEstudiante",length = 40,nullable = false)
    private String apMatEstudiante;

    @Column(name = "dniEstudiante",length = 8,nullable = false)
    private String dniEstudiante;

    @ManyToOne
    @JoinColumn(name = "idTutor")
    private Tutor tutor;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String nombreEstudiante, LocalDate fechaNacimientoEstudiante, String apPatEstudiante, String apMatEstudiante, String dniEstudiante, Tutor tutor) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.fechaNacimientoEstudiante = fechaNacimientoEstudiante;
        this.apPatEstudiante = apPatEstudiante;
        this.apMatEstudiante = apMatEstudiante;
        this.dniEstudiante = dniEstudiante;
        this.tutor = tutor;
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
