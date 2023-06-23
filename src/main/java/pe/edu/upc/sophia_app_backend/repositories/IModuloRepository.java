package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sophia_app_backend.entities.Modulo;

import java.util.List;

@Repository
public interface IModuloRepository extends JpaRepository<Modulo, Integer>
{

    @Query(value = "SELECT c.name_curso ,count(m.id_modulo) from modulos m \n" +
            "join curso c on  m.idcurso = c.idcurso \n" +
            "group by c.name_curso ORDER BY COUNT(c.name_curso) DESC", nativeQuery = true)
    List<String[]> contarModulosxCursos();

    @Query(value = "SELECT c.name_curso ,count(m.id_modulo) from modulos m \n" +
            "join curso c on  m.idcurso = c.idcurso \n" +
            "group by c.name_curso ORDER BY COUNT(c.name_curso) ASC LIMIT 2", nativeQuery = true)
    List<String[]> BuscarCurso_menos_Modulos();

}
