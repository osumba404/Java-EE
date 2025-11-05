package com.example;

import javax.persistence.*;

public class UserListener {
    
    // @PrePersist
    // public void prePersist(User user) {
    //     System.out.println("Before saving user: " + user.getFirstName() + " " + user.getLastName());
    // }
    
    @PostPersist
    public void postPersist(User user) {
        System.out.println("After saving user with ID: " + user.getId());
        System.out.println("User saved: " + user.getFirstName() + " " + user.getLastName());
    }
    
    // @PreUpdate
    // public void preUpdate(User user) {
    //     System.out.println("Before updating user: " + user.getId());
    // }
    
    @PostUpdate
    public void postUpdate(User user) {
        System.out.println("After updating user: " + user.getId());
        System.out.println("User updated: " + user.getFirstName() + " " + user.getLastName());
    }
    // @PreRemove
    // public void preRemove(User user) {
    //     System.out.println("Before removing user: " + user.getId());
    // }
    @PostRemove
    public void postRemove(User user) {
        System.out.println("After removing user: " + user.getId());
        System.out.println("User removed: " + user.getFirstName() + " " + user.getLastName());
    }
    @PostLoad
    public void postLoad(User user) {
        System.out.println("After loading user: " + user.getId());
        System.out.println("User loaded: " + user.getFirstName() + " " + user.getLastName());
    }
    
}