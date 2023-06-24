package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.dtos.CitaCatDTO;
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
    public List<CitaCatDTO> reporte01El() {
        List<String[]> countPsicologoByCat = cR.getCountPsicologoByCat();
        List<CitaCatDTO> citaCatDTOs = new ArrayList<>();

        for (String[] data : countPsicologoByCat) {
            CitaCatDTO dto = new CitaCatDTO();
            dto.setNombreCita(data[0]);
            dto.setNombrePsico(data[1]);
            dto.setCountCita(Integer.parseInt(data[2]));
            citaCatDTOs.add(dto);
        }

        return citaCatDTOs;
    }

    @Override
    public List<CitaPsicoDTO> reporte02El() {
        List<String[]> countCitaByPsico = cR.getCountCitaByPsico();
        List<CitaPsicoDTO> citaPsicoDTOs = new ArrayList<>();

        for (String[] data : countCitaByPsico) {
            CitaPsicoDTO dto = new CitaPsicoDTO();
            dto.setNombrePsico(data[0]);
            dto.setCountCita(Integer.parseInt(data[1]));
            citaPsicoDTOs.add(dto);
        }

        return citaPsicoDTOs;
    }
}
