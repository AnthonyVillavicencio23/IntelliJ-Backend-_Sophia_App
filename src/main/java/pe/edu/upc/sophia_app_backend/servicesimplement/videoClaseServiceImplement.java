package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.videoClase;
import pe.edu.upc.sophia_app_backend.repositories.IvideoClaseRepository;
import pe.edu.upc.sophia_app_backend.services.IvideoClaseService;

import java.util.List;

@Service
public class videoClaseServiceImplement implements IvideoClaseService
{
    @Autowired
    private IvideoClaseRepository vCR;

    @Override
    public void insert(videoClase videoClase) {
        vCR.save(videoClase);
    }

    @Override
    public List<videoClase> list() { return vCR.findAll();}

    @Override
    public void delete(int idVideoClase) {
        vCR.deleteById(idVideoClase);
    }

    @Override
    public videoClase listId(int idVideoClase) {
        return vCR.findById(idVideoClase).orElse(new videoClase());
    }
}
