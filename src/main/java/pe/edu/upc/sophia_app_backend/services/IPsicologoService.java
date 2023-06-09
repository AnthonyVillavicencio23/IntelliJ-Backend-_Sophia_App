package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.dtos.CitaPsicoDTO;
import pe.edu.upc.sophia_app_backend.dtos.EspecialidadPsicologoDTO;
import pe.edu.upc.sophia_app_backend.entities.Psicologo;

import java.util.List;
public interface IPsicologoService {

    public void insert(Psicologo psicologo);
    List<Psicologo> list();

    public void delete(int idPsicologo);

    public Psicologo listId(int idPsicologo);
    public  List<EspecialidadPsicologoDTO> reporte01st();
    public  List<EspecialidadPsicologoDTO> reporte02st();
}
