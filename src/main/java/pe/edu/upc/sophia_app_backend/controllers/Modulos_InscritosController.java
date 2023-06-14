package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.Modulos_IncritosDTO;
import pe.edu.upc.sophia_app_backend.entities.Modulos_Inscritos;
import pe.edu.upc.sophia_app_backend.services.IModulos_InscritosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/modulos_inscritos")
public class Modulos_InscritosController
{
    @Autowired
    private IModulos_InscritosService miS;

    @PostMapping
    public void insert (@RequestBody Modulos_IncritosDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Modulos_Inscritos e = m.map(dto, Modulos_Inscritos.class);

        miS.insert(e);
    }

    @GetMapping
    public List<Modulos_IncritosDTO> list()
    {
        return miS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, Modulos_IncritosDTO.class);
        }).collect(Collectors.toList());
    }
}
