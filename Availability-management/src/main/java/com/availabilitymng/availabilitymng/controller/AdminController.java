package com.availabilitymng.availabilitymng.controller;

import com.availabilitymng.availabilitymng.Dto.CrenauDto;
import com.availabilitymng.availabilitymng.entity.Crenau;
import com.availabilitymng.availabilitymng.service.CrenauService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/creneaux")
@Tag(name = "Admin - Gestion des créneaux")
public class AdminController {
    @Autowired
    private CrenauService creneauService;

    @PostMapping
    @Operation(summary = "Ajouter un créneau")
    public Crenau ajouterCreneau(@RequestBody CrenauDto creneauDto) {
        return creneauService.ajouterCreneau(creneauDto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Modifier un créneau")
    public Crenau modifierCreneau(@PathVariable Long id, @RequestBody CrenauDto creneauDto) {
        return creneauService.modifierCreneau(id, creneauDto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary ="Supprimer un créneau")
    public void supprimerCreneau(@PathVariable Long id) {
        creneauService.supprimerCreneau(id);
    }

    @GetMapping
    @Operation(summary ="Lister tous les créneaux")
    public List<Crenau> listerCreneaux() {
        return creneauService.getCreneauxDisponibles();
    }
}
