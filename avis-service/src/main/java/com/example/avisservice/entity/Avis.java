package com.example.avisservice.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class Avis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;
    private String commentaire;

    @Min(1)
    @Max(5)
    private int etoiles;

    private Long coiffeurId;

    // Getters et Setters

    public int getEtoiles() {
        return etoiles;
    }
}

