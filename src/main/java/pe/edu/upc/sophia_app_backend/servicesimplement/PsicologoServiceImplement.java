package pe.edu.upc.sophia_app_backend.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Psicologo;
import pe.edu.upc.sophia_app_backend.repositories.IPsicologoRepository;
import pe.edu.upc.sophia_app_backend.services.IPsicologoService;

import java.util.List;

@Service
public class PsicologoServiceImplement implements IPsicologoService {

    @Autowired
    private IPsicologoRepository aR;

    @Override
    public void insert(Psicologo psicologo) {aR.save(psicologo);}


    public List<Psicologo> list() {return aR.findAll();}

    @Override
    public void delete(int idPsicologo){
        aR.deleteById(idPsicologo);
    }

    public Psicologo listId(int idPsicologo) { return aR.findById(idPsicologo).orElse(new Psicologo());
    }
}
