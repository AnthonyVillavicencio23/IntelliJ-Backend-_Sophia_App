package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.PsicologoDTO;
import pe.edu.upc.sophia_app_backend.entities.Psicologo;
import pe.edu.upc.sophia_app_backend.services.IPsicologoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/psicologos")
public class PsicologoController {
    @Autowired
    private IPsicologoService aS;

    @PostMapping
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public void insert(@RequestBody PsicologoDTO dto) {
        ModelMapper m = new ModelMapper();
        Psicologo a = m.map(dto, Psicologo.class);
        aS.insert(a);
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'TUTOR', 'ESTUDIANTE')")
    public List<PsicologoDTO> list() {
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PsicologoDTO.class);
        }).collect(Collectors.toList());
    }
    //delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public PsicologoDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        PsicologoDTO dto=m.map(aS.listId(id),PsicologoDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody PsicologoDTO dto){
        ModelMapper m=new ModelMapper();
        Psicologo a=m.map(dto,Psicologo.class);
        aS.insert(a);
    }

}
