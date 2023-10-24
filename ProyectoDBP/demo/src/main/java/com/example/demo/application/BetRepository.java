package com.example.demo.application;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BetRepository extends JpaRepository<Bet, Long> {
    // Métodos específicos del repositorio si es necesario
}
