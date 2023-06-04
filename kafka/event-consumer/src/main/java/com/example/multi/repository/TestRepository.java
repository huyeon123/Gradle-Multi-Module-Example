package com.example.multi.repository;

import com.example.multi.entitiy.Event;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TestRepository extends ReactiveCrudRepository<Event, Long> {

}
