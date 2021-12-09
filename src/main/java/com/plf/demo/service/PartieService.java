package com.plf.demo.service;

import com.plf.demo.repository.PartieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PartieService {
    private final PartieRepository partieRepository;

    
}
