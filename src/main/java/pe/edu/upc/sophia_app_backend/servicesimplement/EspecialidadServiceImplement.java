package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Especialidad;
import pe.edu.upc.sophia_app_backend.repositories.IEspecialidadRepository;
import pe.edu.upc.sophia_app_backend.services.IEspecialidadService;

import java.util.List;
@Service
public class EspecialidadServiceImplement implements IEspecialidadService {

    @Autowired
    private IEspecialidadRepository eR;

    @Override
    public void insert(Especialidad especialidad) {
        eR.save(especialidad);
    }

    @Override
    public List<Especialidad> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEspecialidad) {
        eR.deleteById(idEspecialidad);
    }

    @Override
    public Especialidad listId(int idEspecialidad) {
        return eR.findById(idEspecialidad).orElse(new Especialidad());
    }
}
