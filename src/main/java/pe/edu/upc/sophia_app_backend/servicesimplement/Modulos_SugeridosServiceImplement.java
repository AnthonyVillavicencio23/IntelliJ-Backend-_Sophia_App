package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Modulos_Sugeridos;
import pe.edu.upc.sophia_app_backend.repositories.IModulos_SugeridosRepository;
import pe.edu.upc.sophia_app_backend.services.IModulos_SugeridosService;

import java.util.List;

@Service
public class Modulos_SugeridosServiceImplement implements IModulos_SugeridosService
{

    @Autowired
    private IModulos_SugeridosRepository mdR;

    @Override
    public void insert(Modulos_Sugeridos modulos_sugeridos)
    {
        mdR.save(modulos_sugeridos);
    }
    @Override
    public List<Modulos_Sugeridos> list()
    {
        return mdR.findAll();
    }

    @Override
    public void delete(int idmodulossugeridos)
    {
        mdR.deleteById(idmodulossugeridos);

    }

    @Override
    public Modulos_Sugeridos listId(int idmodulossugeridos) {
        return mdR.findById(idmodulossugeridos).orElse(new Modulos_Sugeridos());
    }
}
