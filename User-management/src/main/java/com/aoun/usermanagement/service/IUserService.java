package com.aoun.usermanagement.service;

import com.aoun.usermanagement.entity.User;

import java.util.List;

public interface IUserService {
    public List<User> retrieveAllUsers();
    public User retrieveUser(Long userId);
    public User addUser(User user);
    public void removeUser(Long userId);
    public User modifyUser(User user);
}
