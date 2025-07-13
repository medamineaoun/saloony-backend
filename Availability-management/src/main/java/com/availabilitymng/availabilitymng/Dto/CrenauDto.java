package com.availabilitymng.availabilitymng.Dto;

import java.time.LocalDateTime;

public class CrenauDto {
    private LocalDateTime dateHeureDebut;
    private LocalDateTime dateHeureFin;

    // Getters & Setters
    public LocalDateTime getDateHeureDebut() { return dateHeureDebut; }
    public void setDateHeureDebut(LocalDateTime dateHeureDebut) { this.dateHeureDebut = dateHeureDebut; }
    public LocalDateTime getDateHeureFin() { return dateHeureFin; }
    public void setDateHeureFin(LocalDateTime dateHeureFin) { this.dateHeureFin = dateHeureFin; }
}
