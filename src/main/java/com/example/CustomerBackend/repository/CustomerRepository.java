package com.example.CustomerBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CustomerBackend.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	Customer findByEmail(String email);

}
