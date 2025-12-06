package com.smarttourism.service.controller;

import com.smarttourism.service.data.DestinationData;
import com.smarttourism.service.model.Destination;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DestinationController {

    @GetMapping("/destinations")
    public List<Destination> getAllDestinations() {
        return DestinationData.getAll();
    }

    @GetMapping("/destinations/{id}")
    public Destination getDestinationById(@PathVariable Long id) {
        return DestinationData.getAll()
                .stream()
                .filter(d -> d.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
