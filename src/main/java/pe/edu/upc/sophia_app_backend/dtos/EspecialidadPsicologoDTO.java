package pe.edu.upc.sophia_app_backend.dtos;

public class EspecialidadPsicologoDTO {
    private String nombre;
    private String nombrePsico;

    public EspecialidadPsicologoDTO() {
    }

    public EspecialidadPsicologoDTO(String nombre, String nombrePsico) {
        this.nombre = nombre;
        this.nombrePsico = nombrePsico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrePsico() {
        return nombrePsico;
    }

    public void setNombrePsico(String nombrePsico) {
        this.nombrePsico = nombrePsico;
    }
}
