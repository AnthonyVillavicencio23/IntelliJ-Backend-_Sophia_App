package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Modulos_Inscritos;

import java.util.List;

public interface IModulos_InscritosService
{
    public void insert(Modulos_Inscritos modulos_inscritos);
    List<Modulos_Inscritos> list();
    public void delete(int idmodulosinscritos);
    public Modulos_Inscritos listId(int idmodulosinscritos);


}
