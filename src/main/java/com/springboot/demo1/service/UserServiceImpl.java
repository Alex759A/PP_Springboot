package com.springboot.demo1.service;


import com.springboot.demo1.model.User;
import com.springboot.demo1.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//import web.model.User;
//import web.repositories.UserRepository;
//
//import java.util.List;


@Service

public class UserServiceImpl  implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }


    @Override
    public User findOne(Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Transactional
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void update(Long id, User updateUser) {
        updateUser.setId(id);
        userRepository.save(updateUser);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

}

