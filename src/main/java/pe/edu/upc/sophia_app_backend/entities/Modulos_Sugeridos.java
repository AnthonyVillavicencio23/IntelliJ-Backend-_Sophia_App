package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "modulos_sugeridos")
public class Modulos_Sugeridos
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idModulosSugeridos;

    @Column(name = "pruebaevaluacion",length = 40,nullable = false)
    private String pruebaevaluacion;

    @ManyToOne
    @JoinColumn(name = "idModulo")
    private Modulo modulo;

    public Modulos_Sugeridos() {
    }

    public Modulos_Sugeridos(int idModulosSugeridos, String pruebaevaluacion, Modulo modulo) {
        this.idModulosSugeridos = idModulosSugeridos;
        this.pruebaevaluacion = pruebaevaluacion;
        this.modulo = modulo;
    }

    public int getIdModulosSugeridos() {
        return idModulosSugeridos;
    }

    public void setIdModulosSugeridos(int idModulosSugeridos) {
        this.idModulosSugeridos = idModulosSugeridos;
    }

    public String getPruebaevaluacion() {
        return pruebaevaluacion;
    }

    public void setPruebaevaluacion(String pruebaevaluacion) {
        this.pruebaevaluacion = pruebaevaluacion;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
