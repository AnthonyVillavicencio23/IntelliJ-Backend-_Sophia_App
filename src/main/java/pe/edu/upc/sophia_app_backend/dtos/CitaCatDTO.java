package pe.edu.upc.sophia_app_backend.dtos;

public class CitaCatDTO {

    private String nombreCita;
    private String nombrePsico;
    private int countCita;

    public CitaCatDTO() {
    }

    public CitaCatDTO(String nombreCita,String nombrePsico, int countCita) {
        this.nombreCita = nombreCita;
        this.nombrePsico = nombrePsico;
        this.countCita = countCita;
    }


    public String getNombrePsico() {
        return nombrePsico;
    }

    public void setNombrePsico(String nombrePsico) {
        this.nombrePsico = nombrePsico;
    }

    public String getNombreCita() {
        return nombreCita;
    }

    public void setNombreCita(String nombreCita) {
        this.nombreCita = nombreCita;
    }

    public int getCountCita() {
        return countCita;
    }

    public void setCountCita(int countCita) {
        this.countCita = countCita;
    }
}
