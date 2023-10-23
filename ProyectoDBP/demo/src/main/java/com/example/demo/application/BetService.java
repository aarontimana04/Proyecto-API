package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.application.dto.BetDTO;
import com.example.demo.domain.model.Bet;
import com.example.demo.domain.repository.BetRepository;

@Service
public class BetService {

    @Autowired
    private BetRepository betRepository;

    public void placeBet(BetDTO betDTO) {
        Bet bet = // Convertir BetDTO a Bet y asignar valores
        betRepository.save(bet);
    }

    public BetDTO getBetById(Long betId) {
        Bet bet = // Obtener apuesta por ID desde el repositorio
        return // Convertir Bet a BetDTO;
    }

    // Otros métodos para actualizar, eliminar y obtener apuestas

}
