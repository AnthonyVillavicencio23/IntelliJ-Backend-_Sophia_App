package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sophia_app_backend.entities.Cita;

import java.util.List;

@Repository
public interface ICitaRepository extends JpaRepository<Cita, Integer> {

    @Query(value = "SELECT  c.nombre_cita,(p.nombre_psico ||' '||p.ap_pat_psicologo || ' '|| p.ap_mat_psicologo) as Psicologo, count(ci.id_cita) from citas ci\n" +
            "join cat_citas c on ci.idcat_cita = c.idcat_cita \n" +
            "join psicologos p on ci.id_psicologo = p.id_psicologo \n" +
            "group by c.nombre_cita, Psicologo ORDER BY COUNT(ci.id_cita) ", nativeQuery = true)
    List<String[]> getCountPsicologoByCat();

    @Query(value = "SELECT (p.nombre_psico ||' '||p.ap_pat_psicologo || ' '|| p.ap_mat_psicologo) as Psicologo , count(ci.id_cita)\n" +
            "from citas ci\n" +
            "join psicologos p on ci.id_psicologo = p.id_psicologo \n" +
            "where ci.id_estado = 3\n" +
            "group by  Psicologo ORDER BY COUNT(ci.id_cita) ", nativeQuery = true)
    List<String[]> getCountCitaByPsico();
}
