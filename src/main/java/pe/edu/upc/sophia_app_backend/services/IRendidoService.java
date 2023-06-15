package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Rendido;


import java.util.List;

public interface IRendidoService {

    public void insert(Rendido rendido);
    List<Rendido> list();
    public void delete(int idRendido);

    public Rendido listId(int idRendido);
}
