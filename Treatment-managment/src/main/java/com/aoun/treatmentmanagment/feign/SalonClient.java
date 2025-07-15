package com.aoun.treatmentmanagment.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "Salon-management") // must match spring.application.name in salon
public interface SalonClient {

    @GetMapping("/api/salon/retrieve-salon/{salon-id}")
    Salon getSalonById(@PathVariable("salon-id") Long salonId);

    class Salon {
        public Long salonId;
        public String salonName;
        public String address;
        // add other fields if needed
    }
}
