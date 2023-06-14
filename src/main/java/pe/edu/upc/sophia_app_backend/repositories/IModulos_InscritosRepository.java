package pe.edu.upc.sophia_app_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.sophia_app_backend.entities.Modulos_Inscritos;

@Repository
public interface IModulos_InscritosRepository extends JpaRepository<Modulos_Inscritos, Integer>
{
}
