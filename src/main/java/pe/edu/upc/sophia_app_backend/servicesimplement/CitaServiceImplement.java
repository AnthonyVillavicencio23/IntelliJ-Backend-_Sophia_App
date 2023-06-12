package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Cita;
import pe.edu.upc.sophia_app_backend.repositories.ICitaRepository;
import pe.edu.upc.sophia_app_backend.services.ICitaService;

import java.util.List;

@Service
public class CitaServiceImplement implements ICitaService {

    @Autowired
    private ICitaRepository cR;

    @Override
    public void insert(Cita cita) {
        cR.save(cita);
    }

    @Override
    public List<Cita> list() {
        return cR.findAll();
    }
}
