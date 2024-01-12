package com.example.CustomerBackend.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	@Column(unique = true)
	private String email;
	private Date dob;
	private String occupation;
	private String cust_group;
	
	
	
	public Customer() {
		super();
	}
	public Customer(Long id, String name, String email, Date dob, String occupation, String cust_group) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.occupation = occupation;
		this.cust_group = cust_group;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCust_group() {
		return cust_group;
	}
	public void setCust_group(String cust_group) {
		this.cust_group = cust_group;
	}
	
	
	
}
