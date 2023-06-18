package pe.edu.upc.sophia_app_backend.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.CitaDTO;
import pe.edu.upc.sophia_app_backend.entities.Cita;
import pe.edu.upc.sophia_app_backend.services.ICitaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private ICitaService cS;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'ESTUDIANTE', 'TUTOR')")
    public void insert (@RequestBody CitaDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Cita c = m.map(dto, Cita.class);

        cS.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'PSICOLOGO')")
    public List<CitaDTO> list()
    {
        return cS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }
}
