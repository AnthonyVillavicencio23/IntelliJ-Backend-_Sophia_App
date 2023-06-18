package pe.edu.upc.sophia_app_backend.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.sophia_app_backend.entities.Role;
import pe.edu.upc.sophia_app_backend.repositories.IRoleRepository;
import pe.edu.upc.sophia_app_backend.services.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {
  @Autowired
    private IRoleRepository rR;

    @Override
    public void insert(Role role) { rR.save(role);}

    @Override
    public List<Role> list() {
      // TODO Auto-generated method stub
      return (rR.findAll());
    }
}