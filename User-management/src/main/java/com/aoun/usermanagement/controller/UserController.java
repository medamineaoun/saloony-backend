package com.aoun.usermanagement.controller;

import com.aoun.usermanagement.entity.User;
import com.aoun.usermanagement.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    UserService userService;

    @GetMapping("/retrieve-all-users")
    public List<User> getUsers(){
        return userService.retrieveAllUsers();
    }

    @PostMapping("/add-user")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/retrieve-user/{user-id}")
    public User retrieveUser(@PathVariable("user-id") Long userId){
        return userService.retrieveUser(userId);
    }

    @DeleteMapping("/remove-user/{user-id}")
    public void removeUser(@PathVariable("user-id") Long userId){
        userService.removeUser(userId);
    }

    @PutMapping("/modify-user")
    public User modifyUser(@RequestBody User user){
        return userService.modifyUser(user);
    }
}