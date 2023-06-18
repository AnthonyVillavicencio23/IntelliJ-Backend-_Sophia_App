package pe.edu.upc.sophia_app_backend.services;



import pe.edu.upc.sophia_app_backend.entities.PagoDeModulo;

import java.util.List;

public interface IPagoDeModuloService {

    public void insert(PagoDeModulo pagodemodulo);
    List<PagoDeModulo> list();

    public void delete(int idPagodeModulo);

    public PagoDeModulo listId(int idPagodeModulo);
}
