package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.model.GeneralUser;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<GeneralUser> getAllUsers() {
        return userRepository.findAll();
    }

    public GeneralUser getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public GeneralUser getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public GeneralUser createUser(GeneralUser user) {
        return userRepository.save(user);
    }

    public GeneralUser updateUser(Long id, GeneralUser userDetails) {
        GeneralUser user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}