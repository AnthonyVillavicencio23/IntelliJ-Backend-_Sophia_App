package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.ComprobantePago;


import java.util.List;

public interface IComprobantePagoService {

    public void insert(ComprobantePago comprobantepago);
    List<ComprobantePago> list();
}
