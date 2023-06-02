package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Psicologo;

import java.util.List;
public interface IPsicologoService {

    public void insert(Psicologo psicologo);
    List<Psicologo> list();

    public void delete(int idPsicologo);

    public Psicologo listId(int idPsicologo);
}
