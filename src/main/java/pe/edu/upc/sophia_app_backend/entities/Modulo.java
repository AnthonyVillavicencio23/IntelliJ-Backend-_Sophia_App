package pe.edu.upc.sophia_app_backend.entities;
import javax.persistence.*;

@Entity
@Table(name = "modulos")
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idModulo;
    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;
    @Column(name = "nombreModulo",length = 45,nullable = false)
    private String nombreModulo;

    public Modulo() {
    }

    public Modulo(int idModulo, Curso curso, String nombreModulo) {
        this.idModulo = idModulo;
        this.curso = curso;
        this.nombreModulo = nombreModulo;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }
}
