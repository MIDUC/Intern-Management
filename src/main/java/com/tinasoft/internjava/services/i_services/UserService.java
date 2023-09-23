package com.tinasoft.internjava.services.i_services;

import com.tinasoft.internjava.models.entities.Role;
import com.tinasoft.internjava.models.entities.User;

public interface UserService {

    public abstract User findById(int Id);
    public abstract void save();
    public abstract void update(int id , User user);
    public abstract void delete(int id);
    public abstract int role_id(int id);
    public abstract Role get_role(int id);
}
