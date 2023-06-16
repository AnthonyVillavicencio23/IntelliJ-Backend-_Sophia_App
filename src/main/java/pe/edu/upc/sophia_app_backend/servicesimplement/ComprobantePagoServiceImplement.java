package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.ComprobantePago;
import pe.edu.upc.sophia_app_backend.repositories.IComprobantePagoRepository;
import pe.edu.upc.sophia_app_backend.services.IComprobantePagoService;

import java.util.List;

@Service
public class ComprobantePagoServiceImplement implements IComprobantePagoService {

    @Autowired
    private IComprobantePagoRepository pR;

    @Override
    public void insert(ComprobantePago comprobantepago) {
        pR.save(comprobantepago);
    }

    @Override
    public List<ComprobantePago> list() {
        return pR.findAll();
    }
}
