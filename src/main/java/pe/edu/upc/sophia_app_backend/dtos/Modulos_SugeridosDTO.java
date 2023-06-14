package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.Modulo;


public class Modulos_SugeridosDTO
{
    private int idModulosSugeridos;
    private String pruebaevaluacion;
    private Modulo modulo;

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
