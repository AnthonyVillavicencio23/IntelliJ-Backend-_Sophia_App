package pe.edu.upc.sophia_app_backend.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pagodemodulo")
public class PagoDeModulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagodeModulo;

    @Column(name = "montopormodulo",length = 40,nullable = false)
    private String montopormodulo;

    @Column(name = "fechapago", nullable = false)
    private LocalDate fechapago;

    @Column(name = "pagado",length = 40,nullable = false)
    private String pagado;



    @ManyToOne
    @JoinColumn(name = "idTarjeta")
    private Tarjeta tarjetacredito;

    @ManyToOne
    @JoinColumn(name = "idModulo")
    private Modulo modulo;


    public PagoDeModulo() {
    }

    public PagoDeModulo(int idPagodeModulo, String montopormodulo, LocalDate fechapago, String pagado, Tarjeta tarjetacredito, Modulo modulo) {
        this.idPagodeModulo = idPagodeModulo;
        this.montopormodulo = montopormodulo;
        this.fechapago = fechapago;
        this.pagado = pagado;
        this.tarjetacredito = tarjetacredito;
        this.modulo = modulo;
    }

    public int getIdPagodeModulo() {
        return idPagodeModulo;
    }

    public void setIdPagodeModulo(int idPagodeModulo) {
        this.idPagodeModulo = idPagodeModulo;
    }

    public String getMontopormodulo() {
        return montopormodulo;
    }

    public void setMontopormodulo(String montopormodulo) {
        this.montopormodulo = montopormodulo;
    }

    public LocalDate getFechapago() {
        return fechapago;
    }

    public void setFechapago(LocalDate fechapago) {
        this.fechapago = fechapago;
    }

    public String getPagado() {
        return pagado;
    }

    public void setPagado(String pagado) {
        this.pagado = pagado;
    }

    public Tarjeta getTarjetacredito() {
        return tarjetacredito;
    }

    public void setTarjetacredito(Tarjeta tarjetacredito) {
        this.tarjetacredito = tarjetacredito;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
}
