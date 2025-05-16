package com.aoun.usermanagement.controller;

import com.aoun.usermanagement.entity.Customer;
import com.aoun.usermanagement.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {
    CustomerService customerService;

    @GetMapping("/retrieve-all-customers")
    public List<Customer> getCustomers(){
        return customerService.retrieveAllCustomers();
    }

    @PostMapping("/add-customer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.addCustomer(customer));
    }

    @GetMapping("/retrieve-customer/{customer-id}")
    public Customer retrieveCustomer(@PathVariable("customer-id") Long customerId){
        return customerService.retrieveCustomer(customerId);
    }

    @DeleteMapping("/remove-customer/{customer-id}")
    public void removeCustomer(@PathVariable("customer-id") Long customerId){
        customerService.removeCustomer(customerId);
    }

    @PutMapping("/modify-customer")
    public Customer modifyCustomer(@RequestBody Customer customer){
        return customerService.modifyCustomer(customer);
    }
}