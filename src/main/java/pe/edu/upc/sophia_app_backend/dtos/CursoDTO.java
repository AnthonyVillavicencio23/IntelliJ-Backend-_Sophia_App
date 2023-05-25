package pe.edu.upc.sophia_app_backend.dtos;

public class CursoDTO
{
    private  int idCurso;
    private String nombreCurso;
    private  int cantidadCurso;

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
