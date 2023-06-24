package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.dtos.TarjetaTutorDTO;
import pe.edu.upc.sophia_app_backend.entities.Tarjeta;
import pe.edu.upc.sophia_app_backend.repositories.ITarjetaRepository;
import pe.edu.upc.sophia_app_backend.services.ITarjetaService;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarjetaServiceImplement implements ITarjetaService {
    @Autowired
    private ITarjetaRepository tR;

    @Override
    public void insert(Tarjeta tarjeta) {
        tR.save(tarjeta);
    }

    @Override
    public List<Tarjeta> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int idTarjeta) {
        tR.deleteById(idTarjeta);
    }

    @Override
    public Tarjeta listId(int idTarjeta) {
        return tR.findById(idTarjeta).orElse(new Tarjeta());
    }

    @Override
    public int countTarjetasDebito() {
        return tR.countTarjetasDebito();
    }

    @Override
    public List<TarjetaTutorDTO> cantidadTarjetasPorTutor() {
        List<String[]> cant = tR.countTarjetasPorTutor();
        List<TarjetaTutorDTO> cantidadTarjetas = new ArrayList<>();
        for(String[] s : cant) {
            TarjetaTutorDTO t = new TarjetaTutorDTO();
            t.setNombre(s[0]);
            t.setCantidad(Integer.parseInt(s[1]));
            cantidadTarjetas.add(t);
        }
        return cantidadTarjetas;
    }
}
