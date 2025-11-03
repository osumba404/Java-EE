package com.logicbig.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OptimisticLockExample {
    private static EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("example-unit");

    public static void main(String[] args) {
        try {
            persistEmployee();
            updateEmployeeDepartment("Sales", 1);
            updateEmployeeDepartment("Admin", 1);
        } finally {
            entityManagerFactory.close();
        }
    }

    private static void updateEmployeeDepartment(String department, Object primaryKey) {
        EntityManager em = entityManagerFactory.createEntityManager();
        Employee employee = em.find(Employee.class, primaryKey);
        em.getTransaction().begin();
        employee.setDepartment(department);
        em.getTransaction().commit();
        em.close();
        System.out.println("Employee updated: " + employee);
    }

    public static void persistEmployee() {
        Employee employee = new Employee("Joe", "IT");
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
        System.out.println("Employee persisted: " + employee);
    }
}