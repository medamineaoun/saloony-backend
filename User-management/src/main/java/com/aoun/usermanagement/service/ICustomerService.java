package com.aoun.usermanagement.service;

import com.aoun.usermanagement.entity.Customer;
import com.aoun.usermanagement.entity.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> retrieveAllCustomers();
    public Customer retrieveCustomer(Long customerId);
    public Customer addCustomer(Customer customer);
    public void removeCustomer(Long customerId);
    public Customer modifyCustomer(Customer customer);
}
