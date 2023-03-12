package com.example.userManagementSystem2.controller;

import com.example.userManagementSystem2.model.User;
import com.example.userManagementSystem2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.OptionPaneUI;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("get-allUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("get-userById/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping("add-user")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping("delete-user/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @PutMapping("update-user/{id}")
    public void updateUser(@PathVariable String id, @RequestBody User newUser) {
        userService.updateUser(id, newUser);
    }

}
