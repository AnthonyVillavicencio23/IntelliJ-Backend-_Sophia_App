package pe.edu.upc.sophia_app_backend.services;
import pe.edu.upc.sophia_app_backend.entities.PruebaEvaluacion;


import java.util.List;
public interface IPruebaEvaluacionService {
    public void insert(PruebaEvaluacion pruebaEvaluacion);
    List<PruebaEvaluacion> list();

    public void delete(int idPruebaEvaluacion);

    public PruebaEvaluacion listId(int idPruebaEvaluacion);
}
