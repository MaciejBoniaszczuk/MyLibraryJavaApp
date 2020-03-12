package pl.boniaszczuk.mylibrary.service;

import pl.boniaszczuk.mylibrary.dao.DAOFactory;
import pl.boniaszczuk.mylibrary.dao.UserDAO;
import pl.boniaszczuk.mylibrary.model.User;

public class UserService {
    public void addUser(String username, String email, String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setActive(true);
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDao = factory.getUserDAO();
        userDao.create(user);
    }
}
