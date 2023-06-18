package pe.edu.upc.sophia_app_backend.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.videoClaseDTO;
import pe.edu.upc.sophia_app_backend.entities.videoClase;
import pe.edu.upc.sophia_app_backend.services.IvideoClaseService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/videoclase")
public class videoClaseController
{
    @Autowired
    private IvideoClaseService vCS;

    @PostMapping
    public void insert (@RequestBody videoClaseDTO dto)
    {
        ModelMapper m = new ModelMapper();
        videoClase e = m.map(dto, videoClase.class);

        vCS.insert(e);
    }

    @GetMapping
    public List<videoClaseDTO> list()
    {
        return vCS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, videoClaseDTO.class);
        }).collect(Collectors.toList());
    }

    //delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        vCS.delete(id);
    }

    @GetMapping("/{id}")
    public videoClaseDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        videoClaseDTO dto=m.map(vCS.listId(id),videoClaseDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody videoClaseDTO dto){
        ModelMapper m=new ModelMapper();
        videoClase a=m.map(dto,videoClase.class);
        vCS.insert(a);
    }
}
