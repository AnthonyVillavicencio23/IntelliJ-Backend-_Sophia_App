package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Estado;

import java.util.List;

public interface IEstadoService {

    public void insert(Estado estado);

    List<Estado> list();

    public void delete(int idEstado);

    public Estado listId(int idEstado);
}
