package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();
}
