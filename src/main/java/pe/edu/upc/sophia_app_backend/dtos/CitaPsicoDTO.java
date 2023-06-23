package pe.edu.upc.sophia_app_backend.dtos;

public class CitaPsicoDTO {
    private String namePsico;
    private String nameCat;
    private int countCita;

    public CitaPsicoDTO() {
    }

    public CitaPsicoDTO(String namePsico, String nameCat, int countCita) {
        this.namePsico = namePsico;
        this.nameCat = nameCat;
        this.countCita = countCita;
    }

    public String getNamePsico() {
        return namePsico;
    }

    public void setNamePsico(String namePsico) {
        this.namePsico = namePsico;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getCountCita() {
        return countCita;
    }

    public void setCountCita(int countCita) {
        this.countCita = countCita;
    }
}
