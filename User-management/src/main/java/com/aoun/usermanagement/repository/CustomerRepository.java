package com.aoun.usermanagement.repository;

import com.aoun.usermanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Optional<Customer> findByUserEmail(String userEmail);
}
