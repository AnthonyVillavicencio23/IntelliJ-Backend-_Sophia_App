package pe.edu.upc.sophia_app_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.sophia_app_backend.dtos.ComprobantePagoDTO;
import pe.edu.upc.sophia_app_backend.dtos.PagoDeModuloDTO;
import pe.edu.upc.sophia_app_backend.entities.ComprobantePago;
import pe.edu.upc.sophia_app_backend.entities.PagoDeModulo;
import pe.edu.upc.sophia_app_backend.services.IComprobantePagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comprobantepago")
public class ComprobantePagoController {

    @Autowired
    private IComprobantePagoService pS;

    @PostMapping
    public void insert (@RequestBody ComprobantePagoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        ComprobantePago p = m.map(dto, ComprobantePago.class);

        pS.insert(p);
    }

    @GetMapping
    public List<ComprobantePagoDTO> list()
    {
        return pS.list().stream().map(x ->
        {
            ModelMapper m = new ModelMapper();
            return  m.map(x, ComprobantePagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id)
    {
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public ComprobantePagoDTO listId(@PathVariable("id")Integer id)
    {
        ModelMapper m = new ModelMapper();
        ComprobantePagoDTO dto = m.map(pS.listId(id), ComprobantePagoDTO.class );

        return dto;
    }

    @PutMapping
    public void goUpdate(@RequestBody ComprobantePagoDTO dto)
    {
        ModelMapper m = new ModelMapper();
        ComprobantePago c = m.map(dto, ComprobantePago.class);

        pS.insert(c);
    }
}
