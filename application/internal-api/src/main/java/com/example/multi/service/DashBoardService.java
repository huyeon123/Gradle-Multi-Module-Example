package com.example.multi.service;

import com.example.multi.Event;
import com.example.multi.repository.DashBoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DashBoardService {
    private final DashBoardRepository dashBoardRepository;


    public List<Event> searchAll() {
        return dashBoardRepository.findAll();
    }
}
