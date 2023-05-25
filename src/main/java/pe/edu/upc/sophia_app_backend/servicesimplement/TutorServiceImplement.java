package pe.edu.upc.sophia_app_backend.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Tutor;
import pe.edu.upc.sophia_app_backend.repositories.ITutorRepository;
import pe.edu.upc.sophia_app_backend.services.ITutorService;

import java.util.List;

@Service
public class TutorServiceImplement implements ITutorService {

    @Autowired
    private ITutorRepository aR;

    @Override
    public void insert(Tutor tutor) {aR.save(tutor);}


    public List<Tutor> list() {return aR.findAll();}

    @Override
    public void delete(int idTutor){
        aR.deleteById(idTutor);
    }


    public Tutor listId(int idTutor) {
        return aR.findById(idTutor).orElse(new Tutor());
    }
}
