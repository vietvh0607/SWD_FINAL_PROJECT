package com.waterinc.repositories;

import com.waterinc.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Asus on 7/2/2017.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}