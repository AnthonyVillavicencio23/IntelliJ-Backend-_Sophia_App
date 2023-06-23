package pe.edu.upc.sophia_app_backend.dtos;

public class moduloxCursoDTO
{
    private String nameCurso;
    private int modulo_contador;

    public moduloxCursoDTO() {
    }

    public moduloxCursoDTO(String nameCurso, int modulo_contador) {
        this.nameCurso = nameCurso;
        this.modulo_contador = modulo_contador;
    }

    public String getNameCurso() {
        return nameCurso;
    }

    public void setNameCurso(String nameCurso) {
        this.nameCurso = nameCurso;
    }

    public int getModulo_contador() {
        return modulo_contador;
    }

    public void setModulo_contador(int modulo_contador) {
        this.modulo_contador = modulo_contador;
    }
}
