package pe.edu.upc.sophia_app_backend.entities;
import javax.persistence.*;

@Entity
@Table(name = "videoclases")
public class videoClase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVideoClase;
    @Column(name = "descripcion",length = 40,nullable = false)
    private String descripcion;
    @Column(name = "nombreVideo",length = 40,nullable = false)
    private String nombreVideo;
    @Column(name = "duracionVideo",length = 10,nullable = false)
    private int duracionVideo;
    @ManyToOne
    @JoinColumn(name = "idModulo")
    private Modulo modulo;

    public videoClase() {
    }

    public videoClase(int idVideoClase, String descripcion, String nombreVideo, int duracionVideo, Modulo modulo) {
        this.idVideoClase = idVideoClase;
        this.descripcion = descripcion;
        this.nombreVideo = nombreVideo;
        this.duracionVideo = duracionVideo;
        this.modulo = modulo;
    }

    public int getIdVideoClase() {
        return idVideoClase;
    }

    public void setIdVideoClase(int idVideoClase) {
        this.idVideoClase = idVideoClase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreVideo() {
        return nombreVideo;
    }

    public void setNombreVideo(String nombreVideo) {
        this.nombreVideo = nombreVideo;
    }

    public int getDuracionVideo() {
        return duracionVideo;
    }

    public void setDuracionVideo(int duracionVideo) {
        this.duracionVideo = duracionVideo;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
