package com.tinasoft.internjava.services.impl_service;

import com.tinasoft.internjava.models.entities.User;
import com.tinasoft.internjava.repositories.UserRepository;
import com.tinasoft.internjava.services.i_services.UserService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceIpml implements UserService {
    @Autowired
    private UserRepository repository;
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public User findById(int Id) {
        return repository.findById(Id).orElseThrow();
    }

    @Override
    public void save() {

    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int role_id(int id) {
        int role_id = (int) entityManager.createNativeQuery("SELECT user_role.role_id FROM user_role WHERE user_id = " + id).getSingleResult();
        return role_id;
    }

    @Override
    public String get_role(int id) {
        String role_name = (String) entityManager.createNativeQuery("SELECT role.name FROM role,user_role WHERE role.id = user_role.role_id AND user_role.user_id = " + id).getSingleResult();
        return role_name;
    }
}
