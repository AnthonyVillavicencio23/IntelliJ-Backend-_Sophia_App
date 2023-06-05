package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Evaluacion;

import java.util.List;

public interface IEvaluacionService {
    public void insert(Evaluacion evaluacion);
    List<Evaluacion> list();
}
