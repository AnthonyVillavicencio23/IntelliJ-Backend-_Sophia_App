package pe.edu.upc.sophia_app_backend.entities;

import javax.persistence.*;

@Entity
@Table(name="tarjetas")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "numero", length = 16, nullable = false)
    private String numero;
    @Column(name = "tipo", length = 7, nullable = false)
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "tutor")
    private Tutor tutor;

    public Tarjeta() {
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

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}
