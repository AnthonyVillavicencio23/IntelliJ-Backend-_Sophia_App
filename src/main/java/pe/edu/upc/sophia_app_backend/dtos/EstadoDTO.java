package pe.edu.upc.sophia_app_backend.dtos;

public class EstadoDTO {

    private int idEstado;
    private String description;

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
