package com.example.multi.controller;

import com.example.multi.Producer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final Producer producer;

    @PostMapping
    public Mono<String> sendMessage(@RequestBody String message) {
        producer.sendMessage(message);
        log.info("Producer Send Message: {}", message);
        return Mono.just("SUCCESS");
    }
}

