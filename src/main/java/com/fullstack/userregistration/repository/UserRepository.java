package com.fullstack.userregistration.repository;


import com.fullstack.userregistration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
