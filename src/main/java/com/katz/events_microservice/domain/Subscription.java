package com.katz.events_microservice.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name="subscription")
@Table(name="subscription")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Event event;

    private String participantingEmail;

    public Subscription(Event event, String participantingEmail) {
        this.event = event;
        this.participantingEmail = participantingEmail;
    }
}
