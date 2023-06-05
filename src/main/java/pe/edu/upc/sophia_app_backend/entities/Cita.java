package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    @Column(name = "disponibleCita",length = 40,nullable = false)
    private String disponibleCita;
    @Column(name = "fechaCita", nullable = false)
    private LocalDate fechaCita;
    @Column(name = "horaCita",length = 30,nullable = false)
    private String horaCita;




    @ManyToOne
    @JoinColumn(name = "id")
    private CatCita id;

    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante idEstudiante;

    @ManyToOne
    @JoinColumn(name = "idPsicologo")
    private Psicologo idPsicologo;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado idEstado;


    public Cita() {
    }

    public Cita(int idCita, String disponibleCita, LocalDate fechaCita, String horaCita, CatCita id, Estudiante idEstudiante, Psicologo idPsicologo, Estado idEstado) {
        this.idCita = idCita;
        this.disponibleCita = disponibleCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.id = id;
        this.idEstudiante = idEstudiante;
        this.idPsicologo = idPsicologo;
        this.idEstado = idEstado;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getDisponibleCita() {
        return disponibleCita;
    }

    public void setDisponibleCita(String disponibleCita) {
        this.disponibleCita = disponibleCita;
    }

    public LocalDate getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(LocalDate fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public CatCita getId() {
        return id;
    }

    public void setId(CatCita id) {
        this.id = id;
    }

    public Estudiante getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Estudiante idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Psicologo getIdPsicologo() {
        return idPsicologo;
    }

    public void setIdPsicologo(Psicologo idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public Estado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado idEstado) {
        this.idEstado = idEstado;
    }
}
