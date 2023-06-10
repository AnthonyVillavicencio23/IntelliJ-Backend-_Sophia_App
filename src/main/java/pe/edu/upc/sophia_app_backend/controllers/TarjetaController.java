package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.TarjetaDTO;
import pe.edu.upc.sophia_app_backend.entities.Tarjeta;
import pe.edu.upc.sophia_app_backend.services.ITarjetaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("tarjetas")
public class TarjetaController {
    @Autowired
    private ITarjetaService tS;
    @PostMapping
    public void insert(@RequestBody TarjetaDTO dto){
        System.out.println(dto);
        ModelMapper m=new ModelMapper();
        Tarjeta t=m.map(dto,Tarjeta.class);
        tS.insert(t);
    }
    @GetMapping
    public List<TarjetaDTO> list(){
        return tS.list().stream().map(x ->{
            ModelMapper m= new ModelMapper();
            return m.map(x,TarjetaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TarjetaDTO listId(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        TarjetaDTO dto=m.map(tS.listId(id),TarjetaDTO.class);
        return dto;
    }
    //Estado
    @PutMapping
    public void goUpdate(@RequestBody TarjetaDTO dto){
        ModelMapper m= new ModelMapper();
        Tarjeta t=m.map(dto,Tarjeta.class);
        tS.insert(t);
    }
}
