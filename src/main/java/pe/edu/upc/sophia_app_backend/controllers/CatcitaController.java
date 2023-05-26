package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.CatcitaDTO;
import pe.edu.upc.sophia_app_backend.entities.CatCita;
import pe.edu.upc.sophia_app_backend.services.ICatcitaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Catcitas")
public class CatcitaController {
    @Autowired
    private ICatcitaService catS;
    @PostMapping
    public void insert(@RequestBody CatcitaDTO dto){
        ModelMapper m = new ModelMapper();
        CatCita cc = m.map(dto, CatCita.class);
        catS.insert(cc);
    }
    @GetMapping
    public List<CatcitaDTO> list(){
        return catS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return  m.map(x,CatcitaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable("id")Integer id){
        catS.delete(id);
    }
    @GetMapping("/{id}")
    public CatcitaDTO listId (@PathVariable("id") Integer id){
        ModelMapper m =new ModelMapper();
        CatcitaDTO dto =m.map(catS.listId(id),CatcitaDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate (@RequestBody CatcitaDTO dto){
        ModelMapper m = new ModelMapper();
        CatCita cc = m.map(dto,CatCita.class);
        catS.insert(cc);
    }
}
