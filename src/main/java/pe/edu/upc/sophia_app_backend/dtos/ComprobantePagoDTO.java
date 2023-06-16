package pe.edu.upc.sophia_app_backend.dtos;

import pe.edu.upc.sophia_app_backend.entities.PagoDeModulo;

public class ComprobantePagoDTO {

    private int idComprobantePago;
    private int montoIGV;
    private String tipoDocumento;
    private String ruc;
    private String razonSocial;
    private String numBoletaFactura;
    private PagoDeModulo pagoModulo;

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
