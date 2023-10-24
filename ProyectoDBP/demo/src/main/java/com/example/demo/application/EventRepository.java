package com.example.demo.application;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    // Métodos específicos del repositorio si es necesario
}
