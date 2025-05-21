package com.aoun.salonmanagement.controller;

import com.aoun.salonmanagement.entity.Salon;
import com.aoun.salonmanagement.service.SalonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/salon")
public class SalonController {
    SalonService salonService;

    @GetMapping("/retrieve-all-salons")
    public List<Salon> getSalons(){
        return salonService.retrieveAllSalons();
    }

    @PostMapping("/add-salon")
    public Salon addSalon(@RequestBody Salon salon){
        return salonService.addSalon(salon);
    }

    @GetMapping("/retrieve-salon/{salon-id}")
    public Salon retrieveSalon(@PathVariable("salon-id") Long salonId){
        return salonService.retrieveSalon(salonId);
    }

    @DeleteMapping("/remove-salon/{salon-id}")
    public void removeSalon(@PathVariable("salon-id") Long salonId){
        salonService.removeSalon(salonId);
    }

    @PutMapping("/modify-salon")
    public Salon modifySalon(@RequestBody Salon salon){
        return salonService.modifySalon(salon);
    }
}