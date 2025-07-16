package com.aoun.usermanagement.controller;

import com.aoun.usermanagement.entity.Provider;
import com.aoun.usermanagement.service.ProviderService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/provider")
public class ProviderController {
    ProviderService providerService;

    @GetMapping("/retrieve-all-providers")
    public List<Provider> getProviders(){
        return providerService.retrieveAllProviders();
    }

    @PostMapping("/add-provider")
    public ResponseEntity<Provider> addProvider(@RequestBody Provider provider){
        return ResponseEntity.ok(providerService.addProvider(provider));
    }

    @GetMapping("/retrieve-provider/{provider-id}")
    public Provider retrieveProvider(@PathVariable("provider-id") Long providerId){
        return providerService.retrieveProvider(providerId);
    }

    @DeleteMapping("/remove-provider/{provider-id}")
    public void removeProvider(@PathVariable("provider-id") Long providerId){
        providerService.removeProvider(providerId);
    }

    @PutMapping("/modify-provider")
    public Provider modifyProvider(@RequestBody Provider provider){
        return providerService.modifyProvider(provider);
    }

    @GetMapping("/retrieve-provider-by-name/{provider-name}")
    public Provider retrieveProvider(@PathVariable("provider-name") String providerName){
        return providerService.retrieveProviderByUserName(providerName);
    }
}
