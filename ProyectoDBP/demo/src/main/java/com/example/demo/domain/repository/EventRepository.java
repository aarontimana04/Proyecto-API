package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
    // Métodos específicos del repositorio si es necesario
}
