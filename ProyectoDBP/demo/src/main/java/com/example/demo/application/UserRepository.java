package com.example.demo.application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Métodos específicos del repositorio si es necesario
}
