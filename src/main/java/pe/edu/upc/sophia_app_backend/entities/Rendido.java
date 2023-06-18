package pe.edu.upc.sophia_app_backend.entities;
import javax.persistence.*;

@Entity
@Table(name="rendidos")
public class Rendido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idRendido;
    @Column(name = "nombreRendido", length = 30, nullable = false)
    private String nombreRendido;

    public Rendido() {
    }
    public Rendido(Integer idRendido, String nombreRendido) {
        this.idRendido = idRendido;
        this.nombreRendido = nombreRendido;
    }

    public Integer getIdRendido() {
        return idRendido;
    }

    public void setIdRendido(Integer idRendido) {
        this.idRendido = idRendido;
    }

    public String getNombreRendido() {
        return nombreRendido;
    }

    public void setNombreRendido(String nombreRendido) {
        this.nombreRendido = nombreRendido;
    }
}
