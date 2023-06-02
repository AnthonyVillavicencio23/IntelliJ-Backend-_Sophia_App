package pe.edu.upc.sophia_app_backend.dtos;

public class TutorDTO {
    private int idTutor;
    private String nombreTutor;
    private String apellidoPatTutor;
    private String apellidoMatTutor;
    private String dniTutor;
    private String telefonoTutor;
    private String emailTutor;
    private String tipopersonaTutor;


    public int getIdTutor() {
        return idTutor;
    }

    public void setIdTutor(int idTutor) {
        this.idTutor = idTutor;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getApellidoPatTutor() {
        return apellidoPatTutor;
    }

    public void setApellidoPatTutor(String apellidoPatTutor) {
        this.apellidoPatTutor = apellidoPatTutor;
    }

    public String getApellidoMatTutor() {
        return apellidoMatTutor;
    }

    public void setApellidoMatTutor(String apellidoMatTutor) {
        this.apellidoMatTutor = apellidoMatTutor;
    }

    public String getDniTutor() {
        return dniTutor;
    }

    public void setDniTutor(String dniTutor) {
        this.dniTutor = dniTutor;
    }

    public String getTelefonoTutor() {
        return telefonoTutor;
    }

    public void setTelefonoTutor(String telefonoTutor) {
        this.telefonoTutor = telefonoTutor;
    }

    public String getEmailTutor() {
        return emailTutor;
    }

    public void setEmailTutor(String emailTutor) {
        this.emailTutor = emailTutor;
    }

    public String getTipopersonaTutor() {
        return tipopersonaTutor;
    }

    public void setTipopersonaTutor(String tipopersonaTutor) {
        this.tipopersonaTutor = tipopersonaTutor;
    }
}
