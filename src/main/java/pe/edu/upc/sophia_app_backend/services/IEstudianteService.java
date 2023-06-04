package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Estudiante;

import java.util.List;

public interface IEstudianteService
{
    public void insert(Estudiante estudiante);
    List<Estudiante> list();
}
