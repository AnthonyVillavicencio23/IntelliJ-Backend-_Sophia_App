package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.dtos.moduloxCursoDTO;
import pe.edu.upc.sophia_app_backend.entities.Modulo;

import java.util.List;
public interface IModuloService {

    public void insert(Modulo modulo);
    List<Modulo> list();

    public void delete(int idModulo);

    public Modulo listId(int idModulo);

    public List<moduloxCursoDTO> reportes01an();

    public List<moduloxCursoDTO> reportes02an();



}
