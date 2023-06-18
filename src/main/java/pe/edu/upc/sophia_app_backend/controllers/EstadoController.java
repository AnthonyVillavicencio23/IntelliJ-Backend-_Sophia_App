package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.EstadoDTO;
import pe.edu.upc.sophia_app_backend.entities.Estado;
import pe.edu.upc.sophia_app_backend.services.IEstadoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estados")
public class EstadoController {
    @Autowired
    private IEstadoService eS;

    @PostMapping
    public void insert(@RequestBody EstadoDTO dto){
        ModelMapper m=new ModelMapper();
        Estado e=m.map(dto,Estado.class);
        eS.insert(e);
    }
    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<EstadoDTO> list(){
        return eS.list().stream().map(x ->{
            ModelMapper m= new ModelMapper();
            return m.map(x,EstadoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EstadoDTO listId(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        EstadoDTO dto=m.map(eS.listId(id),EstadoDTO.class);
        return dto;
    }
//Estado
    @PutMapping
    public void goUpdate(@RequestBody EstadoDTO dto){
        ModelMapper m= new ModelMapper();
        Estado e=m.map(dto,Estado.class);
        eS.insert(e);
    }

}
