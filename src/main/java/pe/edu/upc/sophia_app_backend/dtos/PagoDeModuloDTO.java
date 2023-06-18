package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.Modulo;
import pe.edu.upc.sophia_app_backend.entities.Tarjeta;

import java.time.LocalDate;

public class PagoDeModuloDTO {

    private int idPagodeModulo;
    private String montopormodulo;
    private LocalDate fechapago;
    private String pagado;
    private Tarjeta tarjetacredito;
    private Modulo modulo;

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
