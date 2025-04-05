package com.ictlab.backend.controller;

import com.ictlab.backend.model.Event;
import com.ictlab.backend.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping("/public/events")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @PostMapping("/admin/events")
    public ResponseEntity<Event> createEvent(@RequestBody Event event) {
        event.setCreatedDate(LocalDateTime.now());
        Event savedEvent = eventRepository.save(event);
        return ResponseEntity.ok(savedEvent);
    }
}