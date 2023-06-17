package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.videoClase;

import java.util.List;

public interface IvideoClaseService {
    public void insert(videoClase videoClase);
    List<videoClase> list();

    public void delete(int idVideoClase);

    public videoClase listId(int idVideoClase);
}
