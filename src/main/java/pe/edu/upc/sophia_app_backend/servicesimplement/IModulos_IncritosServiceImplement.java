package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Modulos_Inscritos;
import pe.edu.upc.sophia_app_backend.repositories.IModulos_InscritosRepository;
import pe.edu.upc.sophia_app_backend.services.IModulos_InscritosService;

import java.util.List;

@Service
public class IModulos_IncritosServiceImplement implements IModulos_InscritosService
{
    @Autowired
    private IModulos_InscritosRepository miR;

    @Override
    public void insert(Modulos_Inscritos modulos_inscritos)
    {
        miR.save(modulos_inscritos);

    }

    @Override
    public List<Modulos_Inscritos> list() {
        return miR.findAll();
    }

    @Override
    public void delete(int idmodulosinscritos)
    {
        miR.deleteById(idmodulosinscritos);
    }
    @Override
    public Modulos_Inscritos listId(int idmodulosinscritos)
    {
        return miR.findById(idmodulosinscritos).orElse(new Modulos_Inscritos());
    }
}
