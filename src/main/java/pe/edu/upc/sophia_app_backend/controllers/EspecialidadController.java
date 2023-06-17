package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.EspecialidadDTO;
import pe.edu.upc.sophia_app_backend.entities.Especialidad;
import pe.edu.upc.sophia_app_backend.services.IEspecialidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {
    @Autowired
    private IEspecialidadService eS;

    @PostMapping
    public void insert (@RequestBody EspecialidadDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Especialidad e = m.map(dto, Especialidad.class);
        eS.insert(e);
    }

    @GetMapping
    public List<EspecialidadDTO> list()
    {
        return eS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, EspecialidadDTO.class);
        }).collect(Collectors.toList());
    }

    //delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EspecialidadDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        EspecialidadDTO dto=m.map(eS.listId(id),EspecialidadDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody EspecialidadDTO dto){
        ModelMapper m=new ModelMapper();
        Especialidad a=m.map(dto,Especialidad.class);
        eS.insert(a);
    }
}
