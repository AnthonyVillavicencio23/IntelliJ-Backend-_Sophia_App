package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.dtos.CitaPsicoDTO;
import pe.edu.upc.sophia_app_backend.entities.Cita;
import pe.edu.upc.sophia_app_backend.repositories.ICitaRepository;
import pe.edu.upc.sophia_app_backend.services.ICitaService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CitaServiceImplement implements ICitaService {

    @Autowired
    private ICitaRepository cR;

    @Override
    public void insert(Cita cita) {
        cR.save(cita);
    }

    @Override
    public List<Cita> list() {
        return cR.findAll();
    }

    @Override
    public List<CitaPsicoDTO> reporte01El() {
        List<String[]> countPsicologoByCat = cR.getCountPsicologoByCat();
        List<CitaPsicoDTO> citaPsicoDTOs = new ArrayList<>();

        for (String[] data : countPsicologoByCat) {
            CitaPsicoDTO dto = new CitaPsicoDTO();
            dto.setNamePsico(data[0]);
            dto.setNameCat(data[0]);
            dto.setCountCita(Integer.parseInt(data[1]));
            citaPsicoDTOs.add(dto);
        }

        return citaPsicoDTOs;
    }
}
