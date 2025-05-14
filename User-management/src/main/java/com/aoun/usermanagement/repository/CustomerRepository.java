package com.aoun.usermanagement.repository;

import com.aoun.usermanagement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
