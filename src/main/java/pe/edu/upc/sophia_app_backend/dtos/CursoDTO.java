package pe.edu.upc.sophia_app_backend.dtos;

public class CursoDTO
{
    private  int idcurso;
    private String nameCurso;
    private  int cantCurso;

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
