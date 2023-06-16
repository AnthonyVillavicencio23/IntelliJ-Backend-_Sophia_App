package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Estudiante;
import pe.edu.upc.sophia_app_backend.entities.Modulos_Sugeridos;
import pe.edu.upc.sophia_app_backend.repositories.IEstudianteRepository;
import pe.edu.upc.sophia_app_backend.services.IEstudianteService;

import java.util.List;

@Service
public class EstudianteServiceImplement implements IEstudianteService
{
    @Autowired
    private IEstudianteRepository eR;

    @Override
    public void insert(Estudiante estudiante) {
        eR.save(estudiante);
    }

    @Override
    public List<Estudiante> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idestudiante)
    {
        eR.deleteById(idestudiante);
    }

    @Override
    public Estudiante listId(int idestudiante) {
        return eR.findById(idestudiante).orElse(new Estudiante());
    }
}
