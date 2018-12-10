package com.example.demo.repository;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private Map<Integer, User> users = Collections.unmodifiableMap(
            Stream.of(
                new AbstractMap.SimpleEntry<>(1, new User(1, "Spyros", "A")),
                new AbstractMap.SimpleEntry<>(2, new User(2, "Christos", "P"))
            ).collect(
                Collectors.toMap((e) -> e.getKey(), (e) -> e.getValue())
            )
    );

    public Optional<User> getUserById(int id) {
        return Optional.of(users.get(id));
    }


}
