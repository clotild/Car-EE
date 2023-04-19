package com.example.voitures.dao;

import com.example.voitures.dao.base.ConnectionManager;
import com.example.voitures.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserJdbcDao implements UserDao {
    @Override
    public boolean create(User entity) {
        throw new RuntimeException();
    }

    @Override
    public List<User> findAll() {
        throw new RuntimeException();
    }

    @Override
    public User findById(Long aLong) {
        throw new RuntimeException();
    }

    @Override
    public void update(User entity) {
        throw new RuntimeException();
    }

    @Override
    public void delete(User entity) {
        throw new RuntimeException();
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        Connection connection = ConnectionManager.getINSTANCE();
        String query = "SELECT id, username, password FROM user WHERE username=? and password=?";
        User userFound = null;
        try (PreparedStatement pst = connection.prepareStatement(query)) {
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet result = pst.executeQuery();
            if (result.next()) {
                userFound = new User(
                        result.getLong("id"),
                        result.getString("username"),
                        result.getString("password")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userFound;
    }
}
