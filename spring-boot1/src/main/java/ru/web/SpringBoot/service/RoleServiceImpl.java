package ru.web.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.web.SpringBoot.model.Role;
import ru.web.SpringBoot.dao.RoleDao;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class RoleServiceImpl implements RoleService {
    final RoleDao dao;

    @Autowired
    public RoleServiceImpl(RoleDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Role> getAllRoles() {
        return dao.getAllRoles();
    }

    @Override
    public Role findByName(String name) {
        return dao.findByName(name);
    }

    @Override
    public void save(Role role) {
        dao.save(role);
    }
}
