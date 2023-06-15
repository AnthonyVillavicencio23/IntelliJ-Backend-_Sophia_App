package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.PruebaEvaluacion;
import pe.edu.upc.sophia_app_backend.repositories.IPruebaEvaluacionRepository;
import pe.edu.upc.sophia_app_backend.services.IPruebaEvaluacionService;

import java.util.List;

@Service
public class PruebaEvaluacionServiceImplement implements IPruebaEvaluacionService {
    @Autowired
    private IPruebaEvaluacionRepository pE;
    @Override
    public void insert(PruebaEvaluacion pruebaEvaluacion) {
        pE.save(pruebaEvaluacion);
    }

    @Override
    public List<PruebaEvaluacion> list() {return pE.findAll();}

    @Override
    public void delete(int idPruebaEvaluacion) {pE.deleteById(idPruebaEvaluacion);}

    @Override
    public PruebaEvaluacion listId(int idPruebaEvaluacion) {
        return pE.findById(idPruebaEvaluacion).orElse(new PruebaEvaluacion());
    }
}
