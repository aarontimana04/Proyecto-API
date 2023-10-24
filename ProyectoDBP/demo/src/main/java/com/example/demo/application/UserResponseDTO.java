package com.example.demo.application;

public class UserResponseDTO {
    private Long id;
    private String username;
    private String email;
    private String name;
    private String lastname;
    private Long points;

    // Constructores, getters y setters
    public UserResponseDTO() {
    }

    public UserResponseDTO(Long id, String username, String email, String name, String lastname, Long points) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.points = points;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
}
