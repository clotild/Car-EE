package com.example.voitures.dao;

import com.example.voitures.model.User;

public interface UserDao extends GenericDao<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
