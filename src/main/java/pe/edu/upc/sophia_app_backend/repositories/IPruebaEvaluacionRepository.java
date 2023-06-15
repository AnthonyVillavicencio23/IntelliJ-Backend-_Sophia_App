package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.sophia_app_backend.entities.PruebaEvaluacion;

public interface IPruebaEvaluacionRepository extends JpaRepository<PruebaEvaluacion, Integer> {
}
