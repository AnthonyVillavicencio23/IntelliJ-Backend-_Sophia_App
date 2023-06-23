package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sophia_app_backend.entities.Cita;

import java.util.List;

@Repository
public interface ICitaRepository extends JpaRepository<Cita, Integer> {

    @Query(value = "SELECT  c.nombre_cita, p.nombre_psico, COUNT (*) AS total_citas\n" +
            "FROM cat_citas c\n" +
            "JOIN citas ci ON c.idcat_cita = ci.idcat_cita \n" +
            "JOIN psicologos p ON ci.id_psicologo = p.id_psicologo \n" +
            "GROUP BY c.nombre_cita, p.nombre_psico\n" +
            "order by total_citas  ", nativeQuery = true)
    List<String[]> getCountPsicologoByCat();
}
