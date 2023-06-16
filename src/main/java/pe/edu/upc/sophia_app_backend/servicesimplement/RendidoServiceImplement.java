package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Rendido;
import pe.edu.upc.sophia_app_backend.repositories.IRendidoRepository;
import pe.edu.upc.sophia_app_backend.services.IRendidoService;

import java.util.List;

@Service
public class RendidoServiceImplement implements IRendidoService {
    @Autowired
    private IRendidoRepository rE;

    @Override
    public void insert(Rendido rendido){rE.save(rendido);}

    @Override
    public List<Rendido> list() {
        return rE.findAll();
    }

    @Override
    public void delete(int idRendido) {
        rE.deleteById(idRendido);
    }

    @Override
    public Rendido listId(int idRendido) {
        return rE.findById(idRendido).orElse(new Rendido());
    }

}
