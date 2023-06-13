package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name="tarjetas")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTarjeta;
    @Column(name = "numeroTarjeta", length = 16, nullable = false)
    private String numeroTarjeta;
    @Column(name = "tipoTarjeta", length = 7, nullable = false)
    private String tipoTarjeta;
    @ManyToOne
    @JoinColumn(name = "idTutor")
    private Tutor tutor;

    public Tarjeta() {
    }

    public Tarjeta(Integer idTarjeta, String numeroTarjeta, String tipoTarjeta, Tutor tutor) {
        this.idTarjeta = idTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.tutor = tutor;
    }

    public Integer getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(Integer idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
