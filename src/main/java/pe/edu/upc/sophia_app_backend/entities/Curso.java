package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso
{
    //Nuevos cambios estado
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;

    @Column(name = "nombreCurso", length = 50, nullable = false)
    private String nombreCurso;

    @Column(name = "cantidadCurso", length = 3, nullable = false)
    private  int cantidadCurso;

    public Curso()
    {
    }

    public Curso(int idCurso, String nombreCurso, int cantidadCurso) {
        this.idCurso = idCurso;
        this.nombreCurso = nombreCurso;
        this.cantidadCurso = cantidadCurso;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadCurso() {
        return cantidadCurso;
    }

    public void setCantidadCurso(int cantidadCurso) {
        this.cantidadCurso = cantidadCurso;
    }
}
