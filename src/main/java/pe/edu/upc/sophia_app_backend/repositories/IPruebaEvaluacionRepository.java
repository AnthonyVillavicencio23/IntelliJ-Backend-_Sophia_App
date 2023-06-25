package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.sophia_app_backend.entities.PruebaEvaluacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IPruebaEvaluacionRepository extends JpaRepository<PruebaEvaluacion, Integer> {

    @Query(value = "SELECT c.nombre_rendido ,count(m.id_prueba_evaluacion) from pruebaevaluaciones m \n" +
            "join rendidos c on  m.id_rendido = c.id_rendido \n" +
            "group by c.nombre_rendido ORDER BY COUNT(c.nombre_rendido) DESC", nativeQuery = true)
    List<String[]> contarEvaluacionxRendido();

    @Query(value = "SELECT c.nombre_rendido ,count(m.id_prueba_evaluacion) from pruebaevaluaciones m \n" +
            "join rendidos c on  m.id_rendido = c.id_rendido \n" +
            "group by c.nombre_rendido ORDER BY COUNT(c.nombre_rendido) ASC LIMIT 2", nativeQuery = true)
    List<String[]> BuscarRendido_menos_Evaluacion();
}
