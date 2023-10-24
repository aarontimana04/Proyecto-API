package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService {

    @Autowired
    private BetRepository betRepository;

    public List<Bet> getAllBets() {
        return betRepository.findAll();
    }

    public Bet getBetById(Long id) {
        return betRepository.findById(id).orElse(null);
    }

    public Bet createBet(Bet bet) {
        // Puedes agregar lógica de validación u otras operaciones antes de guardar la apuesta
        return betRepository.save(bet);
    }

    // Otros métodos según sea necesario
}
