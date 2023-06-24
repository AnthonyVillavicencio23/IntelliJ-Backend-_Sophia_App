package pe.edu.upc.sophia_app_backend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sophia_app_backend.entities.Psicologo;

import java.util.List;

@Repository
public interface IPsicologoRepository extends JpaRepository<Psicologo,Integer> {
    @Query(value = "SELECT a.nombre, b.nombre_psico , count(b.id_psicologo) from psicologos b \n" +
            "join especialidades a on b.id_especialidad = a.id_especialidad \n" +
            "group by a.nombre , b.nombre_psico  ORDER BY COUNT(b.id_psicologo) DESC", nativeQuery = true)
    List<String[]> getContarPsicologoByEspecialidad();
}
