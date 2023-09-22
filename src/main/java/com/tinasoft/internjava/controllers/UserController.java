package com.tinasoft.internjava.controllers;

import com.tinasoft.internjava.models.entities.User;
import com.tinasoft.internjava.services.i_services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/members")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}/role")
    public String getRole(@PathVariable int id){
        User user = userService.findById(id);
        String role = "Chức vụ: " + userService.get_role(id);
        return role;
    }
    @GetMapping("/{id}")
    public User getMember(@PathVariable int id){
        User user = userService.findById(id);
        return user;
    }
}
