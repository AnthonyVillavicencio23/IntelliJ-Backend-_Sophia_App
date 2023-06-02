package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Tutor;

import java.util.List;
public interface ITutorService {

    public void insert(Tutor tutor);
    List<Tutor> list();

    public void delete(int idTutor);

    public Tutor listId(int idTutor);
}
