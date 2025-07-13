package com.example.gestionrdv.feignClient;

import com.example.gestionrdv.RDVREST.AvailableDateHour;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "Availability-management")

public interface AvailableDateFeignClient {
    @GetMapping("/available-dates") // <-- le chemin exposé par l'autre microservice
    List<AvailableDateHour> getAllAvailableDates();
}
