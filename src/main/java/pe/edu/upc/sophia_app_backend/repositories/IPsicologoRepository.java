package pe.edu.upc.sophia_app_backend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sophia_app_backend.entities.Psicologo;

import java.util.List;

@Repository
public interface IPsicologoRepository extends JpaRepository<Psicologo,Integer> {
    @Query(value = "SELECT a.nombre, b.nombre_psico from psicologos b \n" +
            "join especialidades a on b.id_especialidad = a.id_especialidad \n" +
            "group by a.nombre , b.nombre_psico  ORDER BY COUNT(b.id_psicologo) DESC", nativeQuery = true)
    List<String[]> getContarPsicologoByEspecialidad();

    @Query(value = "SELECT a.nombre AS especialidad, b.nombre_psico AS psicologo FROM psicologos b \n" +
            "JOIN especialidades a ON b.id_especialidad = a.id_especialidad \n" +
            "WHERE a.id_especialidad = (\n" +
            "    SELECT id_especialidad\n" +
            "    FROM psicologos\n" +
            "    GROUP BY id_especialidad\n" +
            "    ORDER BY COUNT(*) DESC\n" +
            "    LIMIT 1\n" +
            ") \n" +
            "ORDER BY a.nombre", nativeQuery = true)
    List<String[]> getContar_mayor_Especialidad ();
}
