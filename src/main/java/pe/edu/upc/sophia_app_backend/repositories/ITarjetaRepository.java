package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.sophia_app_backend.entities.Tarjeta;

import java.util.List;

public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer> {
    @Query(value = "select count (*)\n" +
            "from tarjetas\n" +
            "where tipo_tarjeta='Debito'", nativeQuery = true)
    int countTarjetasDebito();
    @Query(value = "select concat(tu.nombre_tutor, tu.apellido_pat_tutor), count(*) from tarjetas t \n" +
            "inner  join tutor tu on t.id_tutor = tu.id_tutor group by \n" +
            "t.id_tutor, tu.nombre_tutor,tu.apellido_pat_tutor order by count(*) desc", nativeQuery = true)
    List<String[]> countTarjetasPorTutor();
}
