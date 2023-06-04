package com.example.multi.repository;

import com.example.multi.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DashBoardRepository extends JpaRepository<Event, Long> {
}
