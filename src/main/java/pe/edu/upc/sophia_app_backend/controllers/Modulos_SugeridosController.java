package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.EstudianteDTO;
import pe.edu.upc.sophia_app_backend.dtos.Modulos_SugeridosDTO;
import pe.edu.upc.sophia_app_backend.entities.Estudiante;
import pe.edu.upc.sophia_app_backend.entities.Modulos_Sugeridos;
import pe.edu.upc.sophia_app_backend.services.IModulos_SugeridosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/modulos_sugeridos")
public class Modulos_SugeridosController
{
    @Autowired
    private IModulos_SugeridosService mdS;

    @PostMapping
    public void insert (@RequestBody Modulos_SugeridosDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Modulos_Sugeridos e = m.map(dto, Modulos_Sugeridos.class);

        mdS.insert(e);
    }

    @GetMapping
    public List<Modulos_SugeridosDTO> list()
    {
        return mdS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, Modulos_SugeridosDTO.class);
        }).collect(Collectors.toList());
    }

}
