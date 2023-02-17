package com.kakashi.user.service;

import com.kakashi.user.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public Optional<User> getUserById(int id) ;
    public List<User> getUsers() ;
}
