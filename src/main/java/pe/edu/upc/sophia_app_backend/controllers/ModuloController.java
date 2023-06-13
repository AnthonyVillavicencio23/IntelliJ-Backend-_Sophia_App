package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.ModuloDTO;
import pe.edu.upc.sophia_app_backend.entities.Modulo;
import pe.edu.upc.sophia_app_backend.services.IModuloService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/modulo")
public class ModuloController {

    @Autowired
    private IModuloService mS;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void insert (@RequestBody ModuloDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Modulo e = m.map(dto, Modulo.class);

        mS.insert(e);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<ModuloDTO> list()
    {
        return mS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, ModuloDTO.class);
        }).collect(Collectors.toList());
    }
}
