package com.example;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserService {
    
    @PersistenceContext
    private EntityManager em;
    
    public User createUser(String firstName, String lastName) {
        User user = new User(firstName, lastName);
        em.persist(user);
        return user;
    }
    
    public List<User> getAllUsers() {
        return em.createQuery("SELECT u FROM User u", User.class).getResultList();
    }
    
    public User findUserById(Integer id) {
        return em.find(User.class, id);
    }
    
    public void deleteUser(Integer id) {
        User user = em.find(User.class, id);
        if (user != null) {
            em.remove(user);
        }
    }
}