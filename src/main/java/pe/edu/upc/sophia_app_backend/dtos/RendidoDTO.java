package pe.edu.upc.sophia_app_backend.dtos;
import javax.persistence.*;
public class RendidoDTO {
    private Integer idRendido;
    private String  nombreRendido;

    public RendidoDTO(){
    }
    public int getIdRendido() {
        return idRendido;
    }

    public void setIdRendido(int idRendido) {
        this.idRendido = idRendido;
    }

    public String getNombreRendido() {
        return nombreRendido;
    }

    public void setNombreRendido(String nombreRendido) {
        this.nombreRendido = nombreRendido;
    }
}
