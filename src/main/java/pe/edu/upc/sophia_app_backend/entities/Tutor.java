package pe.edu.upc.sophia_app_backend.entities;


import javax.persistence.*;

@Entity
@Table(name="tutores")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTutor;
    @Column(name = "nombreTutor", length = 30, nullable = false)
    private String nombreTutor;
    @Column(name = "apellidoPatTutor", length = 30, nullable = false)
    private String apellidoPatTutor;
    @Column(name = "apellidoMatTutor", length = 30, nullable = false)
    private String apellidoMatTutor;
    @Column(name = "dniTutor", length = 10, nullable = false)
    private String dniTutor;
    @Column(name = "telefonoTutor", length = 10, nullable = false)
    private String telefonoTutor;
    @Column(name = "emailTutor", length = 75, nullable = false)
    private String emailTutor;
    @Column(name = "tipopersonaTutor", length = 10, nullable = false)
    private String tipopersonaTutor;

    public Tutor() {
    }

    public Tutor(int idTutor, String nombreTutor, String apellidoPatTutor, String apellidoMatTutor,
                 String dniTutor, String telefonoTutor, String emailTutor,
                 String tipopersonaTutor) {
        this.idTutor = idTutor;
        this.nombreTutor = nombreTutor;
        this.apellidoPatTutor = apellidoPatTutor;
        this.apellidoMatTutor = apellidoMatTutor;
        this.dniTutor = dniTutor;
        this.telefonoTutor = telefonoTutor;
        this.emailTutor = emailTutor;
        this.tipopersonaTutor = tipopersonaTutor;
    }

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
