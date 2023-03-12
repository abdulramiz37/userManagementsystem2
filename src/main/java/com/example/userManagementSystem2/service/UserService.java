package com.example.userManagementSystem2.service;

import com.example.userManagementSystem2.dao.UserRepository;
import com.example.userManagementSystem2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repository;

    public Optional<User> getUserById(String id) {
        return repository.findById(id);
    }

    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();
        for (User user : repository.findAll()) {
            users.add(user);
        }
        return users;
    }

    public String addUser(User newUser) {
        repository.save(newUser);
        return "user added";
    }

    public String deleteUser(String id) {
        String userId = repository.findById(id).toString();
        repository.deleteById(userId);
        return "user deleted";
    }

    public String updateUser(String id, User newUser) {
        Optional<User> user = repository.findById(id);
        repository.save(newUser);
        return "updated successfully";
    }

}
