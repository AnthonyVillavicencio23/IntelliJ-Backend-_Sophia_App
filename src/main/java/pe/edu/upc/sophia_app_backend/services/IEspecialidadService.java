package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Especialidad;

import java.util.List;

public interface IEspecialidadService {

    public void insert(Especialidad especialidad);
    List<Especialidad> list();

    public void delete(int idEspecialidad);

    public Especialidad listId(int idEspecialidad);
}
