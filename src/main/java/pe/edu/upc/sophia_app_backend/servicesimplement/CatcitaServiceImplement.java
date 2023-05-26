package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.CatCita;
import pe.edu.upc.sophia_app_backend.repositories.ICatcitaRepository;
import pe.edu.upc.sophia_app_backend.services.ICatcitaService;

import java.util.List;

@Service
public class CatcitaServiceImplement implements ICatcitaService {
   @Autowired
    private ICatcitaRepository catR;

    @Override
    public void insert(CatCita cat) {
        catR.save(cat);
    }

    @Override
    public List<CatCita> list() {
        return catR.findAll();
    }

    @Override
    public void delete(int id) {
        catR.deleteById(id);
    }

    @Override
    public CatCita listId(int id) {
        return catR.findById(id).orElse(new CatCita());
    }
}
