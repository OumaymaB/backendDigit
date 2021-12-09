package com.plf.demo.controller;

import com.plf.demo.entity.Changement;
import com.plf.demo.service.ChangementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("changement")
@AllArgsConstructor
public class ChangementController {
    private final ChangementService changementService;

    @GetMapping("{amendementId}")
    public List<Changement> getAllForAmendment(@PathVariable("amendementId") long amendmentId) {
        return changementService.getAllForAmendment(amendmentId);
    }

    @GetMapping("{id}")
    public Changement getChangement(@PathVariable("id") long id) {
        return changementService.getChangement(id);
    }

    @DeleteMapping("{id}")
    public void deleteChangement(@PathVariable("id") long id) {
        changementService.delete(id);
    }

    @PostMapping
    public Changement create() {
        return changementService.create();
    }

    @PutMapping("{id}")
    public Changement update(@PathVariable("id") long id) {
        return changementService.update(id);
    }
}
