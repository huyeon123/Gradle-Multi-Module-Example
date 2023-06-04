package com.example.multi.entitiy;

import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table(name = "Event")
public class Event {
    @Id
    Long id;

    String message;

    public Event(String message) {
        this.message = message;
    }
}
