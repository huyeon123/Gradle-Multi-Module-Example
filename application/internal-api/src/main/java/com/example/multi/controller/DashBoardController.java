package com.example.multi.controller;

import com.example.multi.Event;
import com.example.multi.service.DashBoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping
@RequiredArgsConstructor
public class DashBoardController {

    private final DashBoardService dashBoardService;

    @GetMapping
    public List<Event> getAll() {
        return dashBoardService.searchAll();
    }
}
