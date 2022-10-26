package com.nestdigital.TodoAppbackend.controller;

import com.nestdigital.TodoAppbackend.dao.TodoDao;
import com.nestdigital.TodoAppbackend.model.TodoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addTodo",consumes = "application/json",produces = "application/json")
    public String addTodo(@RequestBody TodoModel todo){
        System.out.println(todo.toString());
        dao.save(todo);
        return "{status:'success'}";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewSingle",consumes = "application/json",produces = "application/json")
    public List<TodoModel> viewSingle(@RequestBody TodoModel view){
        return (List<TodoModel>) dao.viewSingle(view.getUser_id());
    }

}
