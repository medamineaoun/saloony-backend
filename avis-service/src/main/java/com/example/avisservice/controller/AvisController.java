package com.example.avisservice.controller;

import com.example.avisservice.entity.Avis;
import com.example.avisservice.service.AvisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/avis")
public class AvisController {

    @Autowired
    private AvisService service;

    @PostMapping
    public Avis ajouterAvis(@RequestBody Avis avis) {
        return service.save(avis);
    }

    @GetMapping("/coiffeur/{id}")
    public List<Avis> avisParCoiffeur(@PathVariable Long id) {
        return service.getByCoiffeur(id);
    }

    @GetMapping("/coiffeur/{id}/moyenne")
    public double moyenneEtoiles(@PathVariable Long id) {
        return service.getMoyenneEtoiles(id);
    }
}
