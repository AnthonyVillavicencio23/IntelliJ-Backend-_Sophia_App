package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.EstudianteDTO;
import pe.edu.upc.sophia_app_backend.dtos.EvaluacionDTO;
import pe.edu.upc.sophia_app_backend.entities.Estudiante;
import pe.edu.upc.sophia_app_backend.entities.Evaluacion;
import pe.edu.upc.sophia_app_backend.services.IEvaluacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/evaluacion")
public class EvaluacionController {
    @Autowired
    private IEvaluacionService evS;
    @PostMapping
    public void insert (@RequestBody EvaluacionDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Evaluacion ev = m.map(dto, Evaluacion.class);

        evS.insert(ev);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'PSICOLOGO')")
    public List<EvaluacionDTO> list()
    {
        return evS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, EvaluacionDTO.class);
        }).collect(Collectors.toList());
    }

}
