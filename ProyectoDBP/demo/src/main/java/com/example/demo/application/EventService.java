package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public Event createEvent(Event event) {
        // Puedes agregar lógica de validación u otras operaciones antes de guardar el evento
        return eventRepository.save(event);
    }

    // Otros métodos según sea necesario
}
