package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.dtos.CitaPsicoDTO;
import pe.edu.upc.sophia_app_backend.entities.Cita;


import java.util.List;

public interface ICitaService {

    public void insert(Cita cita);
    List<Cita> list();
    public List<CitaPsicoDTO> reporte01El();
}
