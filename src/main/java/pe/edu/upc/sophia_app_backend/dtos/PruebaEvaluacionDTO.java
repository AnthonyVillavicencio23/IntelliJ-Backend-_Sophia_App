package pe.edu.upc.sophia_app_backend.dtos;
import pe.edu.upc.sophia_app_backend.entities.Rendido;
import pe.edu.upc.sophia_app_backend.entities.Cita;
import pe.edu.upc.sophia_app_backend.entities.Tutor;

import javax.persistence.*;
public class PruebaEvaluacionDTO {

    private Integer idPruebaEvaluacion;
    private Cita cita;
    private String diagnostico;
    private String calificacion;
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

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Rendido getRendido() {
        return rendido;
    }

    public void setRendido(Rendido rendido) {
        this.rendido = rendido;
    }
}
