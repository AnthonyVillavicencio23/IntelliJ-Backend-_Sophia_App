package pe.edu.upc.sophia_app_backend.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.CitaDTO;
import pe.edu.upc.sophia_app_backend.dtos.CitaCatDTO;
import pe.edu.upc.sophia_app_backend.dtos.CitaPsicoDTO;
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
    public List<CitaDTO> list()
    {
        return cS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/citas-count")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<CitaCatDTO> getCountPsicologoByCat() {
        List<CitaCatDTO> citaCatDTOs = cS.reporte01El();
        return citaCatDTOs;
    }
    @GetMapping("/citas-count-psicologo")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<CitaPsicoDTO> getCountCitaByPsico() {
        List<CitaPsicoDTO> citaPsicoDTOs = cS.reporte02El();
        return citaPsicoDTOs;
    }
}
