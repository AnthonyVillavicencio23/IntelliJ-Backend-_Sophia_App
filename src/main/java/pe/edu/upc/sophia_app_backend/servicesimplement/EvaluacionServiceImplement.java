package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Evaluacion;
import pe.edu.upc.sophia_app_backend.repositories.IEvaluacionRepository;
import pe.edu.upc.sophia_app_backend.services.IEvaluacionService;

import java.util.List;

@Service
public class EvaluacionServiceImplement implements IEvaluacionService {
    @Autowired
    private IEvaluacionRepository evR;

    @Override
    public void insert(Evaluacion evaluacion) {
        evR.save(evaluacion);
    }

    @Override
    public List<Evaluacion> list() {
        return evR.findAll();
    }
}
