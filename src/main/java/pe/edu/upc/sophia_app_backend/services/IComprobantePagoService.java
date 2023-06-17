package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.ComprobantePago;
import pe.edu.upc.sophia_app_backend.entities.PagoDeModulo;


import java.util.List;

public interface IComprobantePagoService {

    public void insert(ComprobantePago comprobantepago);
    List<ComprobantePago> list();

    public void delete(int idComprobantePago);

    public ComprobantePago listId(int idComprobantePago);
}
