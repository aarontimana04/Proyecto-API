package com.example.demo.application;

public class BetRequestDTO {
    private String winner;
    private double multiplier;
    private String status;
    private double amount;
    private Long userId;
    private Long eventId;

    // Constructores, getters y setters
    public BetRequestDTO() {
    }

    public BetRequestDTO(String winner, double multiplier, String status, double amount, Long userId, Long eventId) {
        this.winner = winner;
        this.multiplier = multiplier;
        this.status = status;
        this.amount = amount;
        this.userId = userId;
        this.eventId = eventId;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
}
