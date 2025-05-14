package com.aoun.usermanagement.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Provider extends User{

    private String appointmentMode;
    private String providerDescription;
    private Double providerRating;
}
