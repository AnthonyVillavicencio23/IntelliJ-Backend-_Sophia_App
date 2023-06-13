package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Tarjeta;
import pe.edu.upc.sophia_app_backend.repositories.ITarjetaRepository;
import pe.edu.upc.sophia_app_backend.services.ITarjetaService;

import java.util.List;

@Service
public class TarjetaServiceImplement implements ITarjetaService {
    @Autowired
    private ITarjetaRepository tR;

    @Override
    public void insert(Tarjeta tarjeta) {
        tR.save(tarjeta);
    }

    @Override
    public List<Tarjeta> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTarjeta) {
        tR.deleteById(idTarjeta);
    }

    @Override
    public Tarjeta listId(int idTarjeta) {
        return tR.findById(idTarjeta).orElse(new Tarjeta());
    }
}
