package com.kakashi.user.service;

import com.kakashi.user.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {
    static List<User> userList = new ArrayList<>();

    static {

        User user1 = new User(1, "Leonel", "Messi", 35, "messi@dev.go", "Mumbai", "India", "Maharashtra");


        User user2 = new User(2, "Cristiano", "Ronaldo", 37, "ronaldo@test.node", "Delhi", "India", "Delhi NCR");

        User user3 = new User(3, "Santos", "Neymar", 31, "neymar@meta.com", "Bangalore", "India", "Karnataka");

        User user4 = new User(4, "Gareth", "Bale", 34, "bale@hotmail.com", "Mumbai", "India", "Maharashtra");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

    }

    @Override
    public Optional<User> getUserById(int id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    @Override
    public List<User> getUsers() {
        return userList.stream().collect(Collectors.toList());
    }
}
