package pl.boniaszczuk.mylibrary.dao;

import pl.boniaszczuk.mylibrary.model.User;

import java.util.List;

public interface UserDAO extends GenericDAO<User, Long>{

    List<User> getAll();
    User getUserByUsername(String username);
}
