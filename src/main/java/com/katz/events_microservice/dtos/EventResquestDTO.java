package com.katz.events_microservice.dtos;

public record EventResquestDTO(int maxParticipants, int registeredParticipants, String date, String title, String description) {
}
