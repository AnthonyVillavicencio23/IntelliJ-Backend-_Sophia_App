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
@RequestMapping("tarjeta")
public class TarjetaController
{

    @Autowired
    private ITarjetaService tA;

    @PostMapping
    public void insert (@RequestBody TarjetaDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Tarjeta a = m.map(dto, Tarjeta.class);

        tA.insert(a);
    }
    @PutMapping
    public void update (@RequestBody TarjetaDTO dto)
    {
        ModelMapper m = new ModelMapper();
        Tarjeta a = m.map(dto, Tarjeta.class);

        tA.insert(a);
    }

    @GetMapping
    public List<TarjetaDTO> list()
    {
        return tA.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, TarjetaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public TarjetaDTO getTarjeta(@PathVariable("id") Integer id)
    {
        ModelMapper m = new ModelMapper();
        TarjetaDTO t = m.map(tA.listId(id), TarjetaDTO.class);
        return t;
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Integer id){
        tA.delete(id);
    }


}
