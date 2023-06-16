package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.RendidoDTO;
import pe.edu.upc.sophia_app_backend.entities.Rendido;
import pe.edu.upc.sophia_app_backend.services.IRendidoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("rendido")
public class RendidoController {
    @Autowired
    private IRendidoService rE;

    @PostMapping
    public void insert (@RequestBody RendidoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Rendido a = m.map(dto, Rendido.class);

        rE.insert(a);
    }
    @PutMapping
    public void update (@RequestBody RendidoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Rendido a = m.map(dto, Rendido.class);

        rE.insert(a);
    }

    @GetMapping
    public List<RendidoDTO> list()
    {
        return rE.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, RendidoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public RendidoDTO getRendido(@PathVariable("id") Integer id)
    {
        ModelMapper m = new ModelMapper();
        RendidoDTO r = m.map(rE.listId(id), RendidoDTO.class);
        return r;
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Integer id){
        rE.delete(id);
    }

}
