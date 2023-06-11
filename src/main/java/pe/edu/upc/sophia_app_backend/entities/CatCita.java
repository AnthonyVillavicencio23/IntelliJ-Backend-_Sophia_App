package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "catCitas")
public class CatCita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcatCita;
    @Column(name="nombreCita", length = 60, nullable = false)
    private String nombreCita;
    @Column(name="descripcionCita", length = 300, nullable = false)
    private String descripcionCita;

    public CatCita() {
    }

    public CatCita(int idcatCita, String nombreCita, String descripcionCita) {
        this.idcatCita = idcatCita;
        this.nombreCita = nombreCita;
        this.descripcionCita = descripcionCita;
    }

    public int getIdcatCita() {
        return idcatCita;
    }

    public void setIdcatCita(int idcatCita) {
        this.idcatCita = idcatCita;
    }

    public String getNombreCita() {
        return nombreCita;
    }

    public void setNombreCita(String nombreCita) {
        this.nombreCita = nombreCita;
    }

    public String getDescripcionCita() {
        return descripcionCita;
    }

    public void setDescripcionCita(String descripcionCita) {
        this.descripcionCita = descripcionCita;
    }
}
