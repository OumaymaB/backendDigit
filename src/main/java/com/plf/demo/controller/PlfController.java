package com.plf.demo.controller;

import com.plf.demo.entity.Plf;
import com.plf.demo.service.PlfService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/plf")
public class PlfController {

    private PlfService plfService;

    @PostMapping
    public Plf creerPlf(@RequestBody Plf plf){
        return plfService.creerPlf(plf.getNumero(),plf.getNom(),plf.getAnnee());
    }

}
