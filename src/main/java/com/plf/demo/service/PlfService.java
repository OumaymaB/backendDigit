package com.plf.demo.service;

import com.plf.demo.entity.Plf;
import com.plf.demo.repository.PlfRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlfService {

    private PlfRepository plfRepository;

    public Plf creerPlf(String numero, String nom, int annee){

        Plf plf = Plf.builder()
                .numero(numero)
                .nom(nom)
                .annee(annee)
                .build();
        plfRepository.save(plf);
        return plf;
    }
}
