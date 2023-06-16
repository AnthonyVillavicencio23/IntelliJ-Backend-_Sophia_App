package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.Modulo;
import pe.edu.upc.sophia_app_backend.entities.PruebaEvaluacion;


public class Modulos_SugeridosDTO
{
    private int idModulosSugeridos;
    private PruebaEvaluacion pruebaevaluacion;
    private Modulo modulo;

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
