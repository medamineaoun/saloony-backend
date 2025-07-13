package com.availabilitymng.availabilitymng.service;

import com.availabilitymng.availabilitymng.Dto.CrenauDto;
import com.availabilitymng.availabilitymng.entity.Crenau;
import com.availabilitymng.availabilitymng.repo.CrenauRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CrenauService {
    @Autowired
    private CrenauRepo creneauRepository;

    public List<Crenau> getCreneauxDisponibles() {
        return creneauRepository.findByDisponibleTrueAndDateHeureDebutAfter(LocalDateTime.now());
    }

    public Crenau ajouterCreneau(CrenauDto creneauDto) {
        Crenau creneau = new Crenau();
        creneau.setDateHeureDebut(creneauDto.getDateHeureDebut());
        creneau.setDateHeureFin(creneauDto.getDateHeureFin());
        return creneauRepository.save(creneau);
    }

    public Crenau modifierCreneau(Long id, CrenauDto creneauDto) {
        return creneauRepository.findById(id)
                .map(creneau -> {
                    creneau.setDateHeureDebut(creneauDto.getDateHeureDebut());
                    creneau.setDateHeureFin(creneauDto.getDateHeureFin());
                    return creneauRepository.save(creneau);
                })
                .orElseThrow(() -> new RuntimeException("Créneau non trouvé"));
    }

    public void supprimerCreneau(Long id) {
        creneauRepository.deleteById(id);
    }
}
