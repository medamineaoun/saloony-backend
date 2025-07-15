package com.aoun.usermanagement.service;

import com.aoun.usermanagement.entity.Provider;
import com.aoun.usermanagement.repository.ProviderRepository;
import com.aoun.usermanagement.service.IProviderService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProviderService implements IProviderService {
    ProviderRepository providerRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public List<Provider> retrieveAllProviders() {
        return providerRepository.findAll();
    }

    @Override
    public Provider retrieveProvider(Long providerId) {
        return providerRepository.findById(providerId).get();
    }

    @Override
    public Provider addProvider(Provider provider) {
        provider.setUserRole("PROVIDER");
        provider.setUserPassword(passwordEncoder.encode(provider.getUserPassword()));
        return providerRepository.save(provider);
    }

    @Override
    public void removeProvider(Long providerId) {
        providerRepository.deleteById(providerId);
    }

    @Override
    public Provider modifyProvider(Provider provider) {
        return providerRepository.save(provider);
    }
}