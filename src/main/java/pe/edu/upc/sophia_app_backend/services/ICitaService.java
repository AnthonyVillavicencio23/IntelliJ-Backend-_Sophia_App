package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.dtos.CitaCatDTO;
import pe.edu.upc.sophia_app_backend.dtos.CitaPsicoDTO;
import pe.edu.upc.sophia_app_backend.entities.Cita;


import java.util.List;

public interface ICitaService {

    public void insert(Cita cita);
    List<Cita> list();
    public List<CitaCatDTO> reporte01El();
    public  List<CitaPsicoDTO> reporte02El();
}
