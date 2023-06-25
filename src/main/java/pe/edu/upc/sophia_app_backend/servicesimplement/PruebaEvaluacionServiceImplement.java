package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.dtos.PruebaEvaluacionRendidoDTO;
import pe.edu.upc.sophia_app_backend.entities.PruebaEvaluacion;
import pe.edu.upc.sophia_app_backend.repositories.IPruebaEvaluacionRepository;
import pe.edu.upc.sophia_app_backend.services.IPruebaEvaluacionService;

import java.util.ArrayList;
import java.util.List;

@Service
public class PruebaEvaluacionServiceImplement implements IPruebaEvaluacionService {
    @Autowired
    private IPruebaEvaluacionRepository pE;
    @Override
    public void insert(PruebaEvaluacion pruebaEvaluacion) {
        pE.save(pruebaEvaluacion);
    }

    @Override
    public List<PruebaEvaluacion> list() {return pE.findAll();}

    @Override
    public void delete(int idPruebaEvaluacion) {pE.deleteById(idPruebaEvaluacion);}

    @Override
    public PruebaEvaluacion listId(int idPruebaEvaluacion) {
        return pE.findById(idPruebaEvaluacion).orElse(new PruebaEvaluacion());
    }

    @Override
    public List<PruebaEvaluacionRendidoDTO> reportes01pa() {

        List<String[]> contarEvaluacionxRendido = pE.contarEvaluacionxRendido();
        List<PruebaEvaluacionRendidoDTO> evaluacionxRendidoDTOs = new ArrayList<>();

        for (String[] data : contarEvaluacionxRendido) {
            PruebaEvaluacionRendidoDTO dto = new PruebaEvaluacionRendidoDTO();
            dto.setNombreRendido(data[0]);
            dto.setCalificacion_contador(data[1]);
            evaluacionxRendidoDTOs.add(dto);
        }

        return evaluacionxRendidoDTOs;
    }

    @Override
    public List<PruebaEvaluacionRendidoDTO> reportes02pa() {

        List<String[]> BuscarRendido_menos_Evaluacion = pE.BuscarRendido_menos_Evaluacion();
        List<PruebaEvaluacionRendidoDTO> evaluacionxRendidoDTOs = new ArrayList<>();

        for (String[] data : BuscarRendido_menos_Evaluacion) {
            PruebaEvaluacionRendidoDTO dto = new PruebaEvaluacionRendidoDTO();
            dto.setNombreRendido(data[0]);
            dto.setCalificacion_contador(data[1]);
            evaluacionxRendidoDTOs.add(dto);
        }

        return evaluacionxRendidoDTOs;
    }
}
