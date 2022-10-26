package com.nestdigital.TodoAppbackend.dao;

import com.nestdigital.TodoAppbackend.model.TodoModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoDao extends CrudRepository<TodoModel,Integer> {

    @Query(value = "SELECT `id`, `todo`, `user_id` FROM `todo` WHERE `user_id`=:user_id",nativeQuery = true)
    List<TodoModel> viewSingle(Integer user_id);


}
