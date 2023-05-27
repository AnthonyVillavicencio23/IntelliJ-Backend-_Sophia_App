package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="psicologos")
public class Psicologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPsicologo;
    @Column(name = "nombrePsico", length = 30, nullable = false)
    private String nombrePsico;
    @Column(name = "apPatPsicologo", length = 30, nullable = false)
    private String apPatPsicologo;
    @Column(name = "apMatPsicologo", length = 30, nullable = false)
    private String apMatPsicologo;
    @Column(name = "fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name = "especialidad", length = 30, nullable = false)
    private String especialidad;

    public Psicologo() {
    }

    public Psicologo(int idPsicologo, String nombrePsico, String apPatPsicologo, String apMatPsicologo,
                     LocalDate fechaNacimiento, String especialidad) {
        this.idPsicologo = idPsicologo;
        this.nombrePsico = nombrePsico;
        this.apPatPsicologo = apPatPsicologo;
        this.apMatPsicologo = apMatPsicologo;
        this.fechaNacimiento = fechaNacimiento;
        this.especialidad = especialidad;
    }

    public int getIdPsicologo() {
        return idPsicologo;
    }

    public void setIdPsicologo(int idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public String getNombrePsico() {
        return nombrePsico;
    }

    public void setNombrePsico(String nombrePsico) {
        this.nombrePsico = nombrePsico;
    }

    public String getApPatPsicologo() {
        return apPatPsicologo;
    }

    public void setApPatPsicologo(String apPatPsicologo) {
        this.apPatPsicologo = apPatPsicologo;
    }

    public String getApMatPsicologo() {
        return apMatPsicologo;
    }

    public void setApMatPsicologo(String apMatPsicologo) {
        this.apMatPsicologo = apMatPsicologo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
