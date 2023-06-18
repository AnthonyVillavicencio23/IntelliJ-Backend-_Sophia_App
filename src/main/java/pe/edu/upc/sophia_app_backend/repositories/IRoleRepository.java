package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sophia_app_backend.entities.Role;
@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
}
