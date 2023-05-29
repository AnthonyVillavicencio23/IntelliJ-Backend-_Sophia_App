package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Estado;
import pe.edu.upc.sophia_app_backend.repositories.IEstadoRepository;
import pe.edu.upc.sophia_app_backend.services.IEstadoService;

import java.util.List;

@Service
public class EstadoServiceImplement implements IEstadoService {
    @Autowired
    private IEstadoRepository eR;

    @Override
    public void insert(Estado estado) {
        eR.save(estado);
    }

    @Override
    public List<Estado> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEstado) {
        eR.deleteById(idEstado);
    }

    @Override
    public Estado listId(int idEstado) {
        return eR.findById(idEstado).orElse(new Estado());
    }

}
