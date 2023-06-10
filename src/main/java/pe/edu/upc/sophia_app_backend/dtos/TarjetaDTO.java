package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.Tutor;

import javax.persistence.*;

public class TarjetaDTO {
    private Integer id;
    private String numero;
    private String tipo;
    private Tutor tutor;

    public TarjetaDTO() {
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "TarjetaDTO{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tutor=" + tutor +
                '}';
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
