package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Modulo;
import pe.edu.upc.sophia_app_backend.repositories.IModuloRepository;
import pe.edu.upc.sophia_app_backend.services.IModuloService;

import java.util.List;

@Service
public class ModuloServiceImplement implements IModuloService {
    @Autowired
    private IModuloRepository mR;
    @Override
    public void insert(Modulo modulo) { mR.save(modulo); }
    @Override
    public List<Modulo> list() {return mR.findAll();}
}
