package com.nestdigital.TodoAppbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class TodoModel {

    @Id
    @GeneratedValue
    private int id;
    private int user_id;
    private String todo;

    public TodoModel() {
    }

    public TodoModel(int id, int user_id, String todo) {
        this.id = id;
        this.user_id = user_id;
        this.todo = todo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
