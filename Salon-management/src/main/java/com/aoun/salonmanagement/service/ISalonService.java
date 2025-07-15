package com.aoun.salonmanagement.service;

import com.aoun.salonmanagement.entity.Salon;

import java.util.List;

public interface ISalonService {
    public List<Salon> retrieveAllSalons();
    public Salon retrieveSalon(Long salonId);
    public Salon addSalon(Salon salon);
    public void removeSalon(Long salonId);
    public Salon modifySalon(Salon salon);
}
