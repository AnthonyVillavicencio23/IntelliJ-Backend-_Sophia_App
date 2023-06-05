package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "evaluaciones")
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvaluacion;
    @Column(name = "diagnostico",length = 500,nullable = false)
    private String diagnostico;
    @OneToOne
    @JoinColumn(name = "idCita")
    private Cita idCita;

    public Evaluacion() {
    }

    public Evaluacion(int idEvaluacion, String diagnostico, Cita idCita) {
        this.idEvaluacion = idEvaluacion;
        this.diagnostico = diagnostico;
        this.idCita = idCita;
    }

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Cita getIdCita() {
        return idCita;
    }

    public void setIdCita(Cita idCita) {
        this.idCita = idCita;
    }
}
