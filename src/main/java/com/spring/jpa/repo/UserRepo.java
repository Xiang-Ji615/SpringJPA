package com.spring.jpa.repo;

import com.spring.jpa.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User, Integer> {
    List<User> findUserByName(String name);
}
