package pe.edu.upc.sophia_app_backend.servicesimplement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.dtos.EspecialidadPsicologoDTO;
import pe.edu.upc.sophia_app_backend.entities.Psicologo;
import pe.edu.upc.sophia_app_backend.repositories.IPsicologoRepository;
import pe.edu.upc.sophia_app_backend.services.IPsicologoService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class PsicologoServiceImplement implements IPsicologoService {

    @Autowired
    private IPsicologoRepository aR;

    @Override
    public void insert(Psicologo psicologo) {aR.save(psicologo);}


    public List<Psicologo> list() {return aR.findAll();}

    @Override
    public void delete(int idPsicologo){
        aR.deleteById(idPsicologo);
    }

    public Psicologo listId(int idPsicologo) { return aR.findById(idPsicologo).orElse(new Psicologo());
    }

    @Override
    public List<EspecialidadPsicologoDTO> reporte01st() {
        List<String[]> contarPsicologoByEspecialidad = aR.getContarPsicologoByEspecialidad();
        List<EspecialidadPsicologoDTO> psicologoEspecialidadDTOs = new ArrayList<>();

        for (String[] data : contarPsicologoByEspecialidad) {
            EspecialidadPsicologoDTO dto = new EspecialidadPsicologoDTO();
            dto.setNombre(data[0]);
            dto.setNombrePsico(data[1]);
            psicologoEspecialidadDTOs.add(dto);
        }

        return psicologoEspecialidadDTOs;
    }

    @Override
    public List<EspecialidadPsicologoDTO> reporte02st() {
        List<String[]> Contar_mayor_Especialidad = aR.getContar_mayor_Especialidad();
        List<EspecialidadPsicologoDTO> psicologoEspecialidadDTOs = new ArrayList<>();

        for (String[] data : Contar_mayor_Especialidad) {
            EspecialidadPsicologoDTO dto = new EspecialidadPsicologoDTO();
            dto.setNombre(data[0]);
            dto.setNombrePsico(data[1]);
            psicologoEspecialidadDTOs.add(dto);
        }

        return psicologoEspecialidadDTOs;
    }
}
//Listo
