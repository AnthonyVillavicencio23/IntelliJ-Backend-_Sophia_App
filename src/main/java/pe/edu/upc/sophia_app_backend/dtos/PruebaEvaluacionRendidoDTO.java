package pe.edu.upc.sophia_app_backend.dtos;

public class PruebaEvaluacionRendidoDTO {
    private String nombreRendido;
    private String calificacion_contador;

    public PruebaEvaluacionRendidoDTO() {
    }

    public PruebaEvaluacionRendidoDTO(String nombreRendido, String calificacion_contador) {
        this.nombreRendido = nombreRendido;
        this.calificacion_contador = calificacion_contador;
    }

    public String getNombreRendido() {
        return nombreRendido;
    }

    public void setNombreRendido(String nombreRendido) {
        this.nombreRendido = nombreRendido;
    }

    public String getCalificacion_contador() {
        return calificacion_contador;
    }

    public void setCalificacion_contador(String calificacion_contador) {
        this.calificacion_contador = calificacion_contador;
    }
}
