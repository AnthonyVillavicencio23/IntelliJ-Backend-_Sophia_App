package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "catCitas")
public class CatCita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombreCita", length = 60, nullable = false)
    private String nombreCita;
    @Column(name="descripcionCita", length = 300, nullable = false)
    private String descripcionCita;

    public CatCita() {
    }

    public CatCita(int id, String nombreCita, String descripcionCita) {
        this.id = id;
        this.nombreCita = nombreCita;
        this.descripcionCita = descripcionCita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
