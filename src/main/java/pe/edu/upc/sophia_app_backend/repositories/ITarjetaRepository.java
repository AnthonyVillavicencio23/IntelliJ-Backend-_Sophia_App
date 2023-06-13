package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.sophia_app_backend.entities.Tarjeta;

public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer> {

}
