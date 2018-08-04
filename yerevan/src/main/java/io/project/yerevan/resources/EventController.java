package io.project.yerevan.resources;

import io.project.yerevan.domain.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import io.project.yerevan.repositories.EventRepository;
import java.util.Optional;

@RestController
@RequestMapping("/api/v2/events")
public class EventController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final EventRepository eventRepository;

    @Autowired
    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping
    public List<Event> find() {
        return eventRepository.findAll();
    }

    @GetMapping
    public Event get(@RequestParam Long id) {
        LOG.info("Getting event with ID {}.", id);
        Optional<Event> event = eventRepository.findById(id);
        return event.get();
    }

    @PostMapping
    public Event post(@RequestBody Event event) {
        Event savedEvent = eventRepository.save(event);
        return savedEvent;
    }

}
