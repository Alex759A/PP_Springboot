package com.springboot.demo1.repositories;

//import org.springframework.data.repository.CrudRepository;
import com.springboot.demo1.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//import web.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
