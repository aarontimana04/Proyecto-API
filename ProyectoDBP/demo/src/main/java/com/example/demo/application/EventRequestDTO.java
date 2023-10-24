package com.example.demo.application;

public class EventRequestDTO {
    private String name;
    private String description;

    // Constructores, getters y setters
    public EventRequestDTO() {
    }

    public EventRequestDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
