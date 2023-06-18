package pe.edu.upc.sophia_app_backend.services;

import pe.edu.upc.sophia_app_backend.entities.Users;

import java.util.List;

public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();
}
