package com.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserApp {
    private static EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("users-unit");

    public static void main(String[] args) {
        try {
            createUser("Evans", "Osumba");
            createUser("Maxmillan", "Odoo");
            createUser("Bob", "Johnson");
        } finally {
            entityManagerFactory.close();
        }
    }

    private static void createUser(String firstName, String lastName) {
        User user = new User(firstName, lastName);
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        System.out.println("User created: " + user);
    }
}