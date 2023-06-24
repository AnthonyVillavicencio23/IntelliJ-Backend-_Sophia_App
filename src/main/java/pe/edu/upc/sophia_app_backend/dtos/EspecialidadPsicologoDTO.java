package pe.edu.upc.sophia_app_backend.dtos;

public class EspecialidadPsicologoDTO {
    private String nombre;
    private String nombrePsico;
    private int psicologoContar;

    public EspecialidadPsicologoDTO() {
    }

    public EspecialidadPsicologoDTO(String nombre, String nombrePsico,  int psicologoContar) {
        this.nombre = nombre;
        this.nombrePsico = nombrePsico;
        this.psicologoContar = psicologoContar;
    }

    public String getNombrePsico() {
        return nombrePsico;
    }

    public void setNombrePsico(String nombrePsico) {
        this.nombrePsico = nombrePsico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getPsicologoContar() {
        return psicologoContar;
    }

    public void setPsicologoContar(int psicologoContar) {
        this.psicologoContar = psicologoContar;
    }
}
