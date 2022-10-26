package com.nestdigital.TodoAppbackend.dao;

import com.nestdigital.TodoAppbackend.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel,Integer> {

    @Query(value = "SELECT `id`, `email`, `name`, `password`, `phone`, `place` FROM `user_data` WHERE `email`=:email AND `password`=:password",nativeQuery = true)
    List<UserModel> Login(String email,String password);
}
