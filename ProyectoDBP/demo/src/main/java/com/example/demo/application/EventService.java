package com.example.demo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.application.dto.EventDTO;
import com.example.demo.domain.model.Event;
import com.example.demo.domain.repository.EventRepository;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void createEvent(EventDTO eventDTO) {
        Event event = // Convertir EventDTO a Event y asignar valores
        eventRepository.save(event);
    }

    public EventDTO getEventById(Long eventId) {
        Event event = // Obtener evento por ID desde el repositorio
        return // Convertir Event a EventDTO;
    }

    // Otros métodos para actualizar, eliminar y obtener eventos

}
