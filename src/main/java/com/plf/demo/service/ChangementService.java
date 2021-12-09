package com.plf.demo.service;

import com.plf.demo.entity.Changement;
import com.plf.demo.repository.ChangementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ChangementService {

    private ChangementRepository changementRepository;

    public List<Changement> getAllForAmendment(long amendmentId) {
        return changementRepository.findByAmendementId(amendmentId);
    }

    public Changement getChangement(long id) {
        return changementRepository.getById(id);
    }

    @Transactional
    public void delete(long id) {
        changementRepository.deleteById(id);
    }

    public Changement create() {
        Changement changement = Changement.builder().build();
        return changementRepository.save(changement);
    }

    public Changement update(long id) {
        Changement changement = getChangement(id);
        return changementRepository.save(changement);
    }
}
