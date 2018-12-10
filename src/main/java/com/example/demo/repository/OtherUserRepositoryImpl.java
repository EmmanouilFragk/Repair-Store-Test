package com.example.demo.repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository
public class OtherUserRepositoryImpl implements UserRepository {

    private List<User> users = Arrays.asList(new User(1, "Alexandros", "A"), new User(2, "Dimitris", "P"));//List.of(new User(1, "Alexandros", "A"), new User(2, "Dimitris", "P"));

    public Optional<User> getUserById(int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findAny();
    }


}
