package com.availabilitymng.availabilitymng.controller;

import com.availabilitymng.availabilitymng.entity.Crenau;
import com.availabilitymng.availabilitymng.service.CrenauService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client/creneaux")
@Tag(name = "Client - Consultation des créneaux")
public class ClientController {
    @Autowired
    private CrenauService creneauService;

    @GetMapping
    @Operation(summary= "Voir les créneaux disponibles")
    public List<Crenau> voirCreneauxDisponibles() {
        return creneauService.getCreneauxDisponibles();
    }
}
