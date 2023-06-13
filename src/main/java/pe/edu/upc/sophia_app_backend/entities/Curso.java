package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso
{
    //Nuevos cambios estado
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcurso;

    @Column(name = "nameCurso", length = 50, nullable = false)
    private String nameCurso;

    @Column(name = "cantCurso", length = 3, nullable = false)
    private  int cantCurso;

    public Curso() {
    }

    public Curso(int idcurso, String nameCurso, int cantCurso) {
        this.idcurso = idcurso;
        this.nameCurso = nameCurso;
        this.cantCurso = cantCurso;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNameCurso() {
        return nameCurso;
    }

    public void setNameCurso(String nameCurso) {
        this.nameCurso = nameCurso;
    }

    public int getCantCurso() {
        return cantCurso;
    }

    public void setCantCurso(int cantCurso) {
        this.cantCurso = cantCurso;
    }
}
