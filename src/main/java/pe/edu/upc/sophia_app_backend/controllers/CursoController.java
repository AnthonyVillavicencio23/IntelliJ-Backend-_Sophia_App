package pe.edu.upc.sophia_app_backend.controllers;

import io.swagger.models.Model;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.CursoDTO;
import pe.edu.upc.sophia_app_backend.entities.Curso;
import pe.edu.upc.sophia_app_backend.services.ICursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/curso")

public class CursoController
{
    @Autowired
    private ICursoService cS;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void insert (@RequestBody CursoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Curso c = m.map(dto, Curso.class);

        cS.insert(c);
    }

    @GetMapping
    public List<CursoDTO> list()
    {
        return cS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, CursoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id)
    {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CursoDTO listId(@PathVariable("id")Integer id)
    {
        ModelMapper m = new ModelMapper();
        CursoDTO dto = m.map(cS.listId(id), CursoDTO.class );

        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody CursoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Curso c = m.map(dto, Curso.class);

        cS.insert(c);
    }

}
