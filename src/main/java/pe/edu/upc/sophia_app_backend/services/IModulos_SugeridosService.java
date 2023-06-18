package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Modulos_Sugeridos;

import java.util.List;

public interface IModulos_SugeridosService
{
    public void insert(Modulos_Sugeridos modulos_sugeridos);
    List<Modulos_Sugeridos> list();
    public void delete(int idmodulossugeridos);
    public Modulos_Sugeridos listId(int idmodulossugeridos);
}
