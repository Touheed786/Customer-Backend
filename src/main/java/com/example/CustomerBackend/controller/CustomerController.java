package com.example.CustomerBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerBackend.customerService.CustomerService;
import com.example.CustomerBackend.entities.Customer;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/create")
    public ResponseEntity<Customer> createUser(@RequestBody Customer customer) {
        Customer savedUser = customerService.saveCustomer(customer);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
	
	@GetMapping("/")
    public ResponseEntity<List<Customer>> getAll() {
        return ResponseEntity.ok(customerService.getCustomers());
    }

}
