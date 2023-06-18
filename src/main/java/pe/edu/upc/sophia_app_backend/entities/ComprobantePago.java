package pe.edu.upc.sophia_app_backend.entities;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "comprobantepago")
public class ComprobantePago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComprobantePago;
    @Column(name = "montoIGV", length = 40, nullable = false)
    private int montoIGV;
    @Column(name = "tipoDocumento", length = 40, nullable = false)
    private String tipoDocumento;
    @Column(name = "ruc", length = 40, nullable = false)
    private String ruc;
    @Column(name = "razonSocial", length = 40, nullable = false)
    private String razonSocial;
    @Column(name = "numBoletaFactura", length = 40, nullable = false)
    private String numBoletaFactura;



    @ManyToOne
    @JoinColumn(name = "idPagodeModulo")
    private PagoDeModulo pagoModulo;

    public ComprobantePago() {
    }

    public ComprobantePago(int idComprobantePago, int montoIGV, String tipoDocumento, String ruc, String razonSocial, String numBoletaFactura, PagoDeModulo pagoModulo) {
        this.idComprobantePago = idComprobantePago;
        this.montoIGV = montoIGV;
        this.tipoDocumento = tipoDocumento;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.numBoletaFactura = numBoletaFactura;
        this.pagoModulo = pagoModulo;
    }

    public int getIdComprobantePago() {
        return idComprobantePago;
    }

    public void setIdComprobantePago(int idComprobantePago) {
        this.idComprobantePago = idComprobantePago;
    }

    public int getMontoIGV() {
        return montoIGV;
    }

    public void setMontoIGV(int montoIGV) {
        this.montoIGV = montoIGV;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNumBoletaFactura() {
        return numBoletaFactura;
    }

    public void setNumBoletaFactura(String numBoletaFactura) {
        this.numBoletaFactura = numBoletaFactura;
    }

    public PagoDeModulo getPagoModulo() {
        return pagoModulo;
    }

    public void setPagoModulo(PagoDeModulo pagoModulo) {
        this.pagoModulo = pagoModulo;
    }
}
