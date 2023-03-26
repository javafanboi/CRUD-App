package com.userportal.portalbackend.service;

import java.util.List;
import java.util.Optional;

import com.userportal.portalbackend.model.User;

public interface UserService {
public Optional<User> getUser(Long id);
public List<User> getAllUsers();
public void deleteUser(Long id);
public User updateUser(User user);
public User saveUser(User user);
}
