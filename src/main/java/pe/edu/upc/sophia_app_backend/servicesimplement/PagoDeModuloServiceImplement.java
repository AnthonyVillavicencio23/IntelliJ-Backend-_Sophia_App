package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.PagoDeModulo;
import pe.edu.upc.sophia_app_backend.repositories.IPagoDeModuloRepository;
import pe.edu.upc.sophia_app_backend.services.IPagoDeModuloService;

import java.util.List;

@Service
public class PagoDeModuloServiceImplement implements IPagoDeModuloService {

    @Autowired
    private IPagoDeModuloRepository pR;

    @Override
    public void insert(PagoDeModulo pagodemodulo) {
        pR.save(pagodemodulo);
    }

    @Override
    public List<PagoDeModulo> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPagodeModulo) {
        pR.deleteById(idPagodeModulo);
    }

    @Override
    public PagoDeModulo listId(int idPagodeModulo) {
        return pR.findById(idPagodeModulo).orElse(new PagoDeModulo());
    }
}
