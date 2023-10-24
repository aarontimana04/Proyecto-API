package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    // Endpoint para obtener todos los eventos
    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    // Endpoint para obtener un evento por ID
    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Long id) {
        return eventService.getEventById(id);
    }

    // Endpoint para crear un nuevo evento
    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    // Otros endpoints según sea necesario
}
