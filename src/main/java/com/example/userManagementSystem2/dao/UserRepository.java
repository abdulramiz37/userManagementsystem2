package com.example.userManagementSystem2.dao;

import com.example.userManagementSystem2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
