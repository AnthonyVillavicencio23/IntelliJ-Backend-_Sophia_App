package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name="pruebaevaluaciones")
public class PruebaEvaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPruebaEvaluacion;
    @ManyToOne
    @JoinColumn(name = "idCita")
    private Cita cita;
    @Column(name = "diagnosticoPE", length = 500, nullable = false)
    private String diagnosticoPE;
    @Column(name = "calificacionPE", length = 2, nullable = false)
    private String calificacionPE;
    @ManyToOne
    @JoinColumn(name = "idRendido")
    private Rendido rendido;

    public PruebaEvaluacion() {
    }

    public PruebaEvaluacion(Integer idPruebaEvaluacion, Cita cita, String diagnosticoPE, String calificacionPE, Rendido rendido) {
        this.idPruebaEvaluacion = idPruebaEvaluacion;
        this.cita = cita;
        this.diagnosticoPE = diagnosticoPE;
        this.calificacionPE = calificacionPE;
        this.rendido = rendido;
    }

    public Integer getIdPruebaEvaluacion() {
        return idPruebaEvaluacion;
    }

    public void setIdPruebaEvaluacion(Integer idPruebaEvaluacion) {
        this.idPruebaEvaluacion = idPruebaEvaluacion;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public String getDiagnosticoPE() {
        return diagnosticoPE;
    }

    public void setDiagnosticoPE(String diagnosticoPE) {
        this.diagnosticoPE = diagnosticoPE;
    }

    public String getCalificacionPE() {
        return calificacionPE;
    }

    public void setCalificacionPE(String calificacionPE) {
        this.calificacionPE = calificacionPE;
    }

    public Rendido getRendido() {
        return rendido;
    }

    public void setRendido(Rendido rendido) {
        this.rendido = rendido;
    }
}
