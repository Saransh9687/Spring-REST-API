package com.RESTAPI.repo;

import com.RESTAPI.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepoImpl implements UserRepo {

    @PersistenceContext
    private EntityManager em;

    public UserRepoImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public User findByEmail(String email) {

        List<User> users = em.createQuery(
                        "SELECT u FROM User u WHERE u.email = :email",
                        User.class
                )
                .setParameter("email", email)
                .getResultList();

        return users.isEmpty() ? null : users.get(0);
    }
    @Override
    public User save(User user) {
        em.persist(user);
        return user;
    }

    @Override
    public User findById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void delete(User user) {
        em.remove(user);
    }

}
