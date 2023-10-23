package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.model.Bet;

public interface BetRepository extends JpaRepository<Bet, Long> {
    // Métodos específicos del repositorio si es necesario
}
