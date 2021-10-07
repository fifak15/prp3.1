package ru.web.SpringBoot.dao;

import org.springframework.stereotype.Repository;
import ru.web.SpringBoot.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("FROM Role", Role.class).getResultList();
    }

    @Override
    public Role findByName(String name) {
        return entityManager.createQuery("SELECT r FROM Role r WHERE r.name=:name", Role.class)
                .setParameter("name", name).getSingleResult();
    }

    @Override
    public void save(Role role) {
        entityManager.persist(role);
    }
}
