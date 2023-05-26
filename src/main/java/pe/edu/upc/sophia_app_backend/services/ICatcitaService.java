package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.CatCita;

import java.util.List;

public interface ICatcitaService {
    public void insert(CatCita cat);
    List<CatCita> list();
    public void delete (int id);
    public CatCita listId(int id);


}
