package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.PruebaEvaluacionDTO;
import pe.edu.upc.sophia_app_backend.entities.PruebaEvaluacion;
import pe.edu.upc.sophia_app_backend.services.IPruebaEvaluacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("pruebaEvaluacion")
public class PruebaEvaluacionController {
    @Autowired
    private IPruebaEvaluacionService pE;

    @PostMapping
    public void insert (@RequestBody PruebaEvaluacionDTO dto)
    {
        ModelMapper m = new ModelMapper();
        PruebaEvaluacion a = m.map(dto, PruebaEvaluacion.class);

        pE.insert(a);
    }
    @PutMapping
    public void update (@RequestBody PruebaEvaluacionDTO dto)
    {
        ModelMapper m = new ModelMapper();
        PruebaEvaluacion a = m.map(dto, PruebaEvaluacion.class);

        pE.insert(a);
    }

    @GetMapping
    public List<PruebaEvaluacionDTO> list()
    {
        return pE.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, PruebaEvaluacionDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public PruebaEvaluacionDTO getPruebaEvaluacion(@PathVariable("id") Integer id)
    {
        ModelMapper m = new ModelMapper();
        PruebaEvaluacionDTO p = m.map(pE.listId(id), PruebaEvaluacionDTO.class);
        return p;
    }
    @DeleteMapping("/{id}")
    void delete(@PathVariable("id") Integer id){
        pE.delete(id);
    }
}
