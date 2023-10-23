package com.example.demo.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.application.EventService;
import com.example.demo.application.dto.EventDTO;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public ResponseEntity<String> createEvent(@RequestBody EventDTO eventDTO) {
        eventService.createEvent(eventDTO);
        return ResponseEntity.ok("Event created successfully");
    }

    @GetMapping("/{eventId}")
    public ResponseEntity<EventDTO> getEventById(@PathVariable Long eventId) {
        EventDTO eventDTO = eventService.getEventById(eventId);
        return ResponseEntity.ok(eventDTO);
    }

    // Otros métodos para actualizar, eliminar y obtener eventos

}
