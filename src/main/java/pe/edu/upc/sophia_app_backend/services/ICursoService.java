package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Curso;
import java.util.List;

public interface ICursoService
{
    public void insert(Curso curso);
    List<Curso> list();

    public void delete(int idCurso);

    public Curso listId(int idCurso);
}
