package com.auth.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.auth.api.entity.User;
import com.auth.api.repository.UserRepository;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class AuthorisationJwtPension {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(1000001, "aamir", "1234"),
                new User(1000002, "basil", "1234"),
                new User(1000003, "chandan", "1234"),
                new User(1000004, "rajesh", "1234")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(AuthorisationJwtPension.class, args);
    }

}
