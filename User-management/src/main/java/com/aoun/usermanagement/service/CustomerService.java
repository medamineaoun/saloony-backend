package com.aoun.usermanagement.service;

import com.aoun.usermanagement.entity.Customer;
import com.aoun.usermanagement.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService implements ICustomerService{
    CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public List<Customer> retrieveAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer retrieveCustomer(Long customerId) {
        return customerRepository.findById(customerId).get();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        customer.setUserRole("CUSTOMER");
        customer.setUserPassword(passwordEncoder.encode(customer.getUserPassword()));
        return customerRepository.save(customer);
    }

    @Override
    public void removeCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customer modifyCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}