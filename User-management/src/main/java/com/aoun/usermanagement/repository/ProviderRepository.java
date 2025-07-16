package com.aoun.usermanagement.repository;

import com.aoun.usermanagement.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProviderRepository extends JpaRepository<Provider,Long> {
    Optional<Provider> findByUserEmail(String userEmail);

    Optional<Provider> findByUserName(String UserName);

}
