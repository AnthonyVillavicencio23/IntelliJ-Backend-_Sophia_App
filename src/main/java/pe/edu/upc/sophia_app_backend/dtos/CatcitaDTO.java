package pe.edu.upc.sophia_app_backend.dtos;

public class CatcitaDTO {
    private int idcatCita;
    private String nombreCita;
    private String descripcionCita;

    public int getIdcatCita() {
        return idcatCita;
    }

    public void setIdcatCita(int idcatCita) {
        this.idcatCita = idcatCita;
    }

    public String getNombreCita() {
        return nombreCita;
    }

    public void setNombreCita(String nombreCita) {
        this.nombreCita = nombreCita;
    }

    public String getDescripcionCita() {
        return descripcionCita;
    }

    public void setDescripcionCita(String descripcionCita) {
        this.descripcionCita = descripcionCita;
    }
}
