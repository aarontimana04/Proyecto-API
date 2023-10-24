package com.example.demo.application;

public class EventResponseDTO {
    private Long id;
    private String name;
    private String description;

    // Constructores, getters y setters
    public EventResponseDTO() {
    }

    public EventResponseDTO(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

