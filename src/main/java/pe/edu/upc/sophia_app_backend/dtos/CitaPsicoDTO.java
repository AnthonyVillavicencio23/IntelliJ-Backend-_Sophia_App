package pe.edu.upc.sophia_app_backend.dtos;

public class CitaPsicoDTO {
    private String nombrePsico;
    private int countCita;

    public CitaPsicoDTO() {
    }

    public CitaPsicoDTO(String nombrePsico, int countCita) {
        this.nombrePsico = nombrePsico;
        this.countCita = countCita;
    }

    public String getNombrePsico() {
        return nombrePsico;
    }

    public void setNombrePsico(String nombrePsico) {
        this.nombrePsico = nombrePsico;
    }

    public int getCountCita() {
        return countCita;
    }

    public void setCountCita(int countCita) {
        this.countCita = countCita;
    }
}
