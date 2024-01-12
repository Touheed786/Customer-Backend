package com.example.CustomerBackend.customerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerBackend.entities.Customer;
import com.example.CustomerBackend.exceptions.NonUniqueEmailException;
import com.example.CustomerBackend.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Customer saveCustomer(Customer customer) {
        if (isEmailUnique(customer.getEmail())) {
            return customerRepository.save(customer);
        } else {
            // Handle the case where the email is not unique
            throw new NonUniqueEmailException("Email address must be unique");
        }
    }
	
	 public boolean isEmailUnique(String email) {
	        return customerRepository.findByEmail(email) == null;
	    }

}
