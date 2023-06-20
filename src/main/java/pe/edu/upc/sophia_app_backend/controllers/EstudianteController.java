package pe.edu.upc.sophia_app_backend.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.EstudianteDTO;
import pe.edu.upc.sophia_app_backend.entities.Estudiante;
import pe.edu.upc.sophia_app_backend.services.IEstudianteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController
{

    @Autowired
    private IEstudianteService eS;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'TUTOR')")
    public void insert (@RequestBody EstudianteDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Estudiante e = m.map(dto, Estudiante.class);

        eS.insert(e);
    }

    @GetMapping
    public List<EstudianteDTO> list()
    {
        return eS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, EstudianteDTO.class);
        }).collect(Collectors.toList());
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id)
    {
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EstudianteDTO listId(@PathVariable("id")Integer id)
    {
        ModelMapper m = new ModelMapper();
        EstudianteDTO dto = m.map(eS.listId(id), EstudianteDTO.class );

        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody EstudianteDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Estudiante c = m.map(dto, Estudiante.class);

        eS.insert(c);
    }

}
