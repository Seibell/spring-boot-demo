package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.GeneralUser;

public interface UserRepository extends JpaRepository<GeneralUser, Long> {
    GeneralUser findByUsername(String username);
    // Optional<User> findByUsername(String username);
}
