package com.aoun.usermanagement.service;

import com.aoun.usermanagement.entity.Provider;
import com.aoun.usermanagement.entity.Provider;

import java.util.List;

public interface IProviderService {
    public List<Provider> retrieveAllProviders();
    public Provider retrieveProvider(Long providerId);
    public Provider addProvider(Provider provider);
    public void removeProvider(Long providerId);
    public Provider modifyProvider(Provider provider);
}
