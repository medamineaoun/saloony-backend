package com.aoun.salonmanagement.service;

import com.aoun.salonmanagement.entity.Salon;
import com.aoun.salonmanagement.repository.SalonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SalonService implements ISalonService{
    SalonRepository salonRepository;
    @Override
    public List<Salon> retrieveAllSalons() {
        return salonRepository.findAll();
    }

    @Override
    public Salon retrieveSalon(Long salonId) {
        return salonRepository.findById(salonId).get();
    }

    @Override
    public Salon addSalon(Salon salon) {
        return salonRepository.save(salon);
    }

    @Override
    public void removeSalon(Long salonId) {
        salonRepository.deleteById(salonId);
    }

    @Override
    public Salon modifySalon(Salon salon) {
        return salonRepository.save(salon);
    }
}
