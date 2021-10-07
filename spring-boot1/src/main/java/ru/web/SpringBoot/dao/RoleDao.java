package ru.web.SpringBoot.dao;


import ru.web.SpringBoot.model.Role;

import java.util.List;

public interface RoleDao {
    List<Role> getAllRoles();

    Role findByName(String name);

    void save(Role role);
}
