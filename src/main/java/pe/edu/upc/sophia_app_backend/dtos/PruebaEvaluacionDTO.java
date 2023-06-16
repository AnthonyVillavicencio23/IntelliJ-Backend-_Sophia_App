package pe.edu.upc.sophia_app_backend.dtos;
import pe.edu.upc.sophia_app_backend.entities.Rendido;
import pe.edu.upc.sophia_app_backend.entities.Cita;
import pe.edu.upc.sophia_app_backend.entities.Tutor;

import javax.persistence.*;
public class PruebaEvaluacionDTO {

    private Integer idPruebaEvaluacion;
    private Cita cita;
    private String diagnosticoPE;
    private String calificacionPE;
    private Rendido rendido;

    public PruebaEvaluacionDTO() {
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
