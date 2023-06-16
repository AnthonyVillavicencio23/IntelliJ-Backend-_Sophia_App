package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "modulos_sugeridos")
public class Modulos_Sugeridos
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idModulosSugeridos;
    @ManyToOne
    @JoinColumn(name = "idPruebaEvaluacion")
    private PruebaEvaluacion pruebaevaluacion;
    @ManyToOne
    @JoinColumn(name = "idModulo")
    private Modulo modulo;

    public Modulos_Sugeridos() {
    }

    public Modulos_Sugeridos(int idModulosSugeridos, PruebaEvaluacion pruebaevaluacion, Modulo modulo) {
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

    public PruebaEvaluacion getPruebaevaluacion() {
        return pruebaevaluacion;
    }

    public void setPruebaevaluacion(PruebaEvaluacion pruebaevaluacion) {
        this.pruebaevaluacion = pruebaevaluacion;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
