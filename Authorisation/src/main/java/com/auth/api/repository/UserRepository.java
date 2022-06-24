package com.auth.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.api.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
