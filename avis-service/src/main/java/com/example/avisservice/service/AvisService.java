package com.example.avisservice.service;

import com.example.avisservice.entity.Avis;
import com.example.avisservice.repository.AvisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AvisService {

    @Autowired
    private AvisRepository repo;

    public Avis save(Avis avis) {
        return repo.save(avis);
    }

    public List<Avis> getByCoiffeur(Long id) {
        return repo.findByCoiffeurId(id);
    }

    public double getMoyenneEtoiles(Long id) {
        List<Avis> list = repo.findByCoiffeurId(id);
        return list.stream().mapToInt(Avis::getEtoiles).average().orElse(0.0);
    }
}

