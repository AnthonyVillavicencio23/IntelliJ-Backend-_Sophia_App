package pe.edu.upc.sophia_app_backend.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.CursoDTO;
import pe.edu.upc.sophia_app_backend.dtos.PagoDeModuloDTO;
import pe.edu.upc.sophia_app_backend.entities.Curso;
import pe.edu.upc.sophia_app_backend.entities.PagoDeModulo;
import pe.edu.upc.sophia_app_backend.services.IPagoDeModuloService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagodemodulo")
public class PagoDeModuloController {

    @Autowired
    private IPagoDeModuloService pS;

    @PostMapping
    public void insert (@RequestBody PagoDeModuloDTO dto)
    {
        ModelMapper m = new ModelMapper();
        PagoDeModulo p = m.map(dto, PagoDeModulo.class);

        pS.insert(p);
    }

    @GetMapping
    public List<PagoDeModuloDTO> list()
    {
        return pS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, PagoDeModuloDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id)
    {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PagoDeModuloDTO listId(@PathVariable("id")Integer id)
    {
        ModelMapper m = new ModelMapper();
        PagoDeModuloDTO dto = m.map(pS.listId(id), PagoDeModuloDTO.class );

        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody PagoDeModuloDTO dto)
    {
        ModelMapper m = new ModelMapper();
        PagoDeModulo c = m.map(dto, PagoDeModulo.class);

        pS.insert(c);
    }
}
