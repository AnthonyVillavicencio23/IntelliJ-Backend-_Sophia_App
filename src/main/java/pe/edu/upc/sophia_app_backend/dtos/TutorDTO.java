package pe.edu.upc.sophia_app_backend.dtos;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TutorDTO {

    private int idTutor;
    private String nombreTutor;
    private String apellidoPatTutor;
    private String apellidoMatTutor;
    private String dniTutor;
    private String telefono;
    private String email;
    private String tipopersona;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(String tipopersona) {
        this.tipopersona = tipopersona;
    }
}
