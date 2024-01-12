package com.example.CustomerBackend.entities;

import java.sql.Date;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private Date dob;
	private String occupation;
	private String cust_group;
	public Customer(int id, String name, String email, Date dob, String occupation, String cust_group) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.occupation = occupation;
		this.cust_group = cust_group;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
