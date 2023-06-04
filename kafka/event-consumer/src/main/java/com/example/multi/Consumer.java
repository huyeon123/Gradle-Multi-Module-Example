package com.example.multi;

import com.example.multi.entitiy.Event;
import com.example.multi.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Consumer {

    private final TestRepository testRepository;

    @KafkaListener(topics = "user-event", groupId = "multi-test")
    public void consume(String message) {
        log.info("Consumer: {}", message);
        testRepository.save(new Event(message)).subscribe();
    }
}
