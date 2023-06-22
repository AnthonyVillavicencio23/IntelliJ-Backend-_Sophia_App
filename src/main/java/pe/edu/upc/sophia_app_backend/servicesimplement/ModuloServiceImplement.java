package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.dtos.moduloxCursoDTO;
import pe.edu.upc.sophia_app_backend.entities.Modulo;
import pe.edu.upc.sophia_app_backend.repositories.IModuloRepository;
import pe.edu.upc.sophia_app_backend.services.IModuloService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuloServiceImplement implements IModuloService
{
    @Autowired
    private IModuloRepository mR;
    @Override
    public void insert(Modulo modulo) {mR.save(modulo);}
    @Override
    public List<Modulo> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int idModulo){
        mR.deleteById(idModulo);
    }

    public Modulo listId(int idModulo) { return mR.findById(idModulo).orElse(new Modulo());
    }

    @Override
    public List<moduloxCursoDTO> reportes01an() {

        List<String[]> contarModulosCursos = mR.contarModulosxCursos();
        List<moduloxCursoDTO> moduloxCursoDTOs = new ArrayList<>();

        for (String[] data : contarModulosCursos) {
            moduloxCursoDTO dto = new moduloxCursoDTO();
            dto.setNameCurso(data[0]);
            dto.setModulo_contador(Integer.parseInt(data[1]));
            moduloxCursoDTOs.add(dto);
        }

        return moduloxCursoDTOs;
    }

    @Override
    public List<moduloxCursoDTO> reportes02an() {

        List<String[]> buscarCurso_menos_modulos = mR.BuscarCurso_menos_Modulos();
        List<moduloxCursoDTO> moduloxCursoDTOs = new ArrayList<>();

        for (String[] data : buscarCurso_menos_modulos) {
            moduloxCursoDTO dto = new moduloxCursoDTO();
            dto.setNameCurso(data[0]);
            dto.setModulo_contador(Integer.parseInt(data[1]));
            moduloxCursoDTOs.add(dto);
        }

        return moduloxCursoDTOs;
    }
}
