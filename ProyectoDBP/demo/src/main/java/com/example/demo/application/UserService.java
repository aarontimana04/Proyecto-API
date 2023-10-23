package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.application.dto.UserDTO;
import com.example.demo.domain.model.User;
import com.example.demo.domain.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void createUser(UserDTO userDTO) {
        User user = // Convertir UserDTO a User y asignar valores
        userRepository.save(user);
    }

    public UserDTO getUserById(Long userId) {
        User user = // Obtener usuario por ID desde el repositorio
        return // Convertir User a UserDTO;
    }

    // Otros métodos para actualizar, eliminar y obtener usuarios

}
