package pe.edu.upc.sophia_app_backend.entities;


import javax.persistence.*;

@Entity
@Table(name="tutores")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombreTutor", length = 30, nullable = false)
    private String nombreTutor;
    @Column(name = "apellidoPatTutor", length = 30, nullable = false)
    private String apellidoPatTutor;
    @Column(name = "apellidoMatTutor", length = 30, nullable = false)
    private String apellidoMatTutor;
    @Column(name = "dniTutor", length = 10, nullable = false)
    private String dniTutor;
    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;
    @Column(name = "email", length = 75, nullable = false)
    private String email;
    @Column(name = "tipopersona", length = 10, nullable = false)
    private String tipopersona;

    @Override
    public String toString() {
        return "Tutor{" +
                "id=" + id +
                ", nombreTutor='" + nombreTutor + '\'' +
                ", apellidoPatTutor='" + apellidoPatTutor + '\'' +
                ", apellidoMatTutor='" + apellidoMatTutor + '\'' +
                ", dniTutor='" + dniTutor + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", tipopersona='" + tipopersona + '\'' +
                '}';
    }

    public Tutor() {
    }

    public Tutor(int id, String nombreTutor, String apellidoPatTutor, String apellidoMatTutor,
                 String dniTutor, String telefono, String email,
                 String tipopersona) {
        this.id = id;
        this.nombreTutor = nombreTutor;
        this.apellidoPatTutor = apellidoPatTutor;
        this.apellidoMatTutor = apellidoMatTutor;
        this.dniTutor = dniTutor;
        this.telefono = telefono;
        this.email = email;
        this.tipopersona = tipopersona;
    }

    public int getId() {
        return id;
    }

    public void setId(int idTutor) {
        this.id = idTutor;
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

    public void setTelefono(String telefonoTutor) {
        this.telefono = telefonoTutor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailTutor) {
        this.email = emailTutor;
    }

    public String getTipopersona() {
        return tipopersona;
    }

    public void setTipopersona(String tipopersonaTutor) {
        this.tipopersona = tipopersonaTutor;
    }
}
