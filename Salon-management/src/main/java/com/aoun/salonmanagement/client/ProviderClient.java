package com.aoun.salonmanagement.client;

import com.aoun.salonmanagement.dto.ProviderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "User-management")
public interface ProviderClient {
    @GetMapping("/api/provider/retrieve-provider/{provider-id}")
    public ProviderDto retrieveProvider(@PathVariable("provider-id") Long providerId);

    @GetMapping("/api/provider/retrieve-all-providers")
    public List<ProviderDto> getProviders();
}
