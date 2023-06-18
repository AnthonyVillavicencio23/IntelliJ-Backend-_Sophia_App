package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.sophia_app_backend.entities.Evaluacion;

public interface IEvaluacionRepository extends JpaRepository<Evaluacion, Integer> {

}
