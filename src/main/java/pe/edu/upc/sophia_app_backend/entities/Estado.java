package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "estados")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idEstado;
    @Column(name = "description",length = 60,nullable = false)
    private String description;

    public Estado() {
    }

    public Estado(int idEstado, String description) {
        this.idEstado = idEstado;
        this.description = description;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
