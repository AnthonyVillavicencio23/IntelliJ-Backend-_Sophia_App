package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Tarjeta;

import java.util.List;

public interface ITarjetaService {
    public void insert(Tarjeta tarjeta);
    List<Tarjeta> list();

    public void delete(int id);

    public Tarjeta listId(int id);
}
