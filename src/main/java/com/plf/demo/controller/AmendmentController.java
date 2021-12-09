package com.plf.demo.controller;

import com.plf.demo.entity.AmendementActuel;
import com.plf.demo.service.AmendmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("amendment")
@AllArgsConstructor
public class AmendmentController {
    private final AmendmentService amendmentService;

    @GetMapping("actuel")
    public List<AmendementActuel> getCurrent() {
        return amendmentService.getAllCurrent();
    }

    @PostMapping
    public AmendementActuel create() {
        return amendmentService.createCurrent();
    }
}
