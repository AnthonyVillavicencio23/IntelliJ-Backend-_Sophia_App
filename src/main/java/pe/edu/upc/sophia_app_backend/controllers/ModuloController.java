package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void insert (@RequestBody ModuloDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Modulo e = m.map(dto, Modulo.class);

        mS.insert(e);
    }

    @GetMapping
    public List<ModuloDTO> list()
    {
        return mS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, ModuloDTO.class);
        }).collect(Collectors.toList());
    }

    //delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id")Integer id){
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public ModuloDTO listId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ModuloDTO dto=m.map(mS.listId(id),ModuloDTO.class);
        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ModuloDTO dto){
        ModelMapper m=new ModelMapper();
        Modulo a=m.map(dto,Modulo.class);
        mS.insert(a);
    }
}
