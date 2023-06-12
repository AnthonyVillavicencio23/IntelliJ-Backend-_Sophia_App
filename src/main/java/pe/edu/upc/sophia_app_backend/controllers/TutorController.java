package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.TutorDTO;
import pe.edu.upc.sophia_app_backend.entities.Tutor;
import pe.edu.upc.sophia_app_backend.services.ITutorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Tutor")
public class TutorController {
    @Autowired
    private ITutorService aS;

    @PostMapping
    public void insert(@RequestBody TutorDTO dto) {
        ModelMapper m = new ModelMapper();
        Tutor a = m.map(dto, Tutor.class);
        aS.insert(a);
    }

    @GetMapping
    public List<TutorDTO> list() {
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,TutorDTO.class);
        }).collect(Collectors.toList());
    }
//delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public TutorDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        TutorDTO dto=m.map(aS.listId(id),TutorDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody TutorDTO dto){
        ModelMapper m=new ModelMapper();
        Tutor a=m.map(dto,Tutor.class);
        aS.insert(a);
    }

}
