package service;

import com.example.voitures.dao.UserDao;
import com.example.voitures.dao.UserJdbcDao;
import com.example.voitures.model.User;

public class UserService {

    private UserDao userDao = new UserJdbcDao();

    public boolean login(String username, String password) {
        User userFound = userDao.findByUsernameAndPassword(username, password);
        if (userFound != null) {
            return userFound.getPassword().equals(password);
        }
        return false;
    }
}
