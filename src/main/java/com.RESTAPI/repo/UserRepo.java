package com.RESTAPI.repo;

import com.RESTAPI.entity.User;

public interface UserRepo {

    User findByEmail(String email);
    User save(User user);
    User findById(Long id);
    void delete(User user);
}
