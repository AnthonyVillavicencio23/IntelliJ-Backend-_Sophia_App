package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Modulo;

import java.util.List;

public interface IModuloService {
    public void insert(Modulo modulo);
    List<Modulo> list();

}
