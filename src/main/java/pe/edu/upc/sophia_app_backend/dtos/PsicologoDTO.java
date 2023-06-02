package pe.edu.upc.sophia_app_backend.dtos;

import java.time.LocalDate;

public class PsicologoDTO {
    private int idPsicologo;
    private String nombrePsico;
    private String apPatPsicologo;
    private String apMatPsicologo;
    private LocalDate fechaNacimiento;
    private String especialidad;


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
