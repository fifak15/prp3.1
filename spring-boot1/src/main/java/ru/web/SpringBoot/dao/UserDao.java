package ru.web.SpringBoot.dao;


import ru.web.SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void save(User user);

    void delete(Long id);

    User getById(Long id);

    User getByLogin(String login);
}
