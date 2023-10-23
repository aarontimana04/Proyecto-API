package com.example.demo.application.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.application.BetService;
import com.example.demo.application.dto.BetDTO;

@RestController
@RequestMapping("/api/bets")
public class BetController {

    @Autowired
    private BetService betService;

    @PostMapping
    public ResponseEntity<String> placeBet(@RequestBody BetDTO betDTO) {
        betService.placeBet(betDTO);
        return ResponseEntity.ok("Bet placed successfully");
    }

    @GetMapping("/{betId}")
    public ResponseEntity<BetDTO> getBetById(@PathVariable Long betId) {
        BetDTO betDTO = betService.getBetById(betId);
        return ResponseEntity.ok(betDTO);
    }

    // Otros métodos para actualizar, eliminar y obtener apuestas

}
