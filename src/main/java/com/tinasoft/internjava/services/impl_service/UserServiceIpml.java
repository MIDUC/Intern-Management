package com.tinasoft.internjava.services.impl_service;

import com.tinasoft.internjava.models.entities.Role;
import com.tinasoft.internjava.models.entities.User;
import com.tinasoft.internjava.repositories.RoleRepository;
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
    @Autowired
    RoleRepository roleRepo;
    
    @Override
    public User findById(int Id) {
    	try {
    		User user = repository.findById(Id).orElseThrow();
        	user.setPositon(get_role(user.getRole()));
            return user;
		} catch (Exception e) {
			return null;
		}
    	
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
        int role_id = (int) entityManager.createNativeQuery("SELECT user_roles.role_id FROM user_roles WHERE user_id = " + id).getSingleResult();
        return role_id;
    }

    @Override
    public Role get_role(int id) {
        Role role =  (Role) entityManager.createNativeQuery("SELECT * FROM roles WHERE roles.id = " + id,Role.class).getSingleResult();
        return role;
    }
}
