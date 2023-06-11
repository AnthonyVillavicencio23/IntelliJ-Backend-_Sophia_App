package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;
@Entity
@Table(name = "modulos")
public class Modulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idModulo;
    @Column(name = "nombreModulo",length = 40,nullable = false)
    private String nombreModulo;
    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Curso curso;


    public Modulo() {
    }

    public Modulo(int idModulo, String nombreModulo, Curso curso) {
        this.idModulo = idModulo;
        this.nombreModulo = nombreModulo;
        this.curso = curso;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
