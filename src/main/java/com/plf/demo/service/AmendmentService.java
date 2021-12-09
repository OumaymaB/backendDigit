package com.plf.demo.service;

import com.plf.demo.entity.AmendementActuel;
import com.plf.demo.repository.AmendementActuelRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AmendmentService {

    private AmendementActuelRepository amendementActuelRepository;

    public List<AmendementActuel> getAllCurrent() {
        return amendementActuelRepository.findAll();
    }

    public AmendementActuel createCurrent() {
        AmendementActuel amendementActuel = AmendementActuel.builder()
                .build();
        return amendementActuelRepository.save(amendementActuel);
    }
}
