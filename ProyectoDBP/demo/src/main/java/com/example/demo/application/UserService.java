package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        // Puedes agregar lógica de validación u otras operaciones antes de guardar el usuario
        return userRepository.save(user);
    }

    // Otros métodos según sea necesario
}
