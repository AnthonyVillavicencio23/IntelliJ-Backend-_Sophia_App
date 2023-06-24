package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.dtos.TarjetaTutorDTO;
import pe.edu.upc.sophia_app_backend.entities.Tarjeta;

import java.util.List;

public interface ITarjetaService {
    public void insert(Tarjeta tarjeta);
    List<Tarjeta> list();

    public void delete(int idTarjeta);

    public Tarjeta listId(int idTarjeta);

    public int countTarjetasDebito();
    public List<TarjetaTutorDTO> cantidadTarjetasPorTutor();
}