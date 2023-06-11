package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Curso;
import pe.edu.upc.sophia_app_backend.repositories.ICursoRepository;
import pe.edu.upc.sophia_app_backend.services.ICursoService;

import java.util.List;

@Service
public class CursoServiceImplement implements ICursoService
{
    @Autowired
    private ICursoRepository cR;

    @Override
    public void insert(Curso curso)
    {
        cR.save(curso);
    }

    @Override
    public List<Curso> list()
    {
        return cR.findAll();
    }

    @Override
    public void delete(int idcurso)
    {
        cR.deleteById(idcurso);
    }

    @Override
    public Curso listId(int idcurso)
    {
        return cR.findById(idcurso).orElse(new Curso());
    }
}
