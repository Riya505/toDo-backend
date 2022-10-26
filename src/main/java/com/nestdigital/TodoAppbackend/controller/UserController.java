package com.nestdigital.TodoAppbackend.controller;

import com.nestdigital.TodoAppbackend.dao.UserDao;
import com.nestdigital.TodoAppbackend.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userData",consumes = "application/json",produces = "application/json")
    public String userData(@RequestBody UserModel user){
        System.out.println(user.toString());
        dao.save(user);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login",consumes = "application/json",produces = "application/json")
    public List<UserModel> login(@RequestBody UserModel login){
        return (List<UserModel>) dao.Login(login.getEmail(),login.getPassword());
    }
}
