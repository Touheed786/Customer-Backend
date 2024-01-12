package com.example.CustomerBackend.customerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerBackend.entities.Customer;
import com.example.CustomerBackend.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveUser(Customer customer) {
        return customerRepository.save(customer);
    }

}
