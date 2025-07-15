package com.example.gestionrdv.RDVREST;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;
// c un DTO
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DateHour {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String dateHour ;


}
