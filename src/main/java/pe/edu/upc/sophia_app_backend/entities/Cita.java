package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    @Column(name = "disponible",length = 40,nullable = false)
    private String disponible;
    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;
    @Column(name = "hora",length = 30,nullable = false)
    private String hora;




    @ManyToOne
    @JoinColumn(name = "idcatCita")
    private CatCita catCita;

    @ManyToOne
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "idPsicologo")
    private Psicologo psicologo;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;

    public Cita() {
    }

    public Cita(int idCita, String disponible, LocalDate fecha, String hora, CatCita catCita, Estudiante estudiante, Psicologo psicologo, Estado estado) {
        this.idCita = idCita;
        this.disponible = disponible;
        this.fecha = fecha;
        this.hora = hora;
        this.catCita = catCita;
        this.estudiante = estudiante;
        this.psicologo = psicologo;
        this.estado = estado;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public CatCita getCatCita() {
        return catCita;
    }

    public void setCatCita(CatCita catCita) {
        this.catCita = catCita;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
