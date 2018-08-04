package io.project.yerevan.resources;

import io.project.yerevan.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import io.project.yerevan.repositories.EventRepository;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2/events")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public List<Event> find() {
        return eventRepository.findAll();
    }

    @GetMapping("/event")
    public Event get(@RequestParam Long id) {
        Optional<Event> event = eventRepository.findById(id);
        return event.get();
    }

    @PostMapping
    public Event post(@RequestBody Event event) {
        Event savedEvent = eventRepository.save(event);
        return savedEvent;
    }

}
