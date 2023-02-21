package com.springboot.demo1.service;

import com.springboot.demo1.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

//import web.model.User;
//
//import java.util.List;
@Service
public interface UserService {

    List<User> findAll();

    void save(User user);

    User findOne(Long id);

    void update(Long id, User updateUser);

    void delete(Long id);

}

