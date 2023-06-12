package pe.edu.upc.sophia_app_backend.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sophia_app_backend.entities.Cita;

@Repository
public interface ICitaRepository extends JpaRepository<Cita, Integer> {
}