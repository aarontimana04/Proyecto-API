package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bets")
public class BetController {

    @Autowired
    private BetService betService;

    // Endpoint para obtener todas las apuestas
    @GetMapping
    public List<Bet> getAllBets() {
        return betService.getAllBets();
    }

    // Endpoint para obtener una apuesta por ID
    @GetMapping("/{id}")
    public Bet getBetById(@PathVariable Long id) {
        return betService.getBetById(id);
    }

    // Endpoint para crear una nueva apuesta
    @PostMapping
    public Bet createBet(@RequestBody Bet bet) {
        return betService.createBet(bet);
    }

    // Otros endpoints según sea necesario
}
