package com.example.postservice.model;

public class Customer {
	String customer_number;
	String firstname;
	String middlename;
	String lastname;
	String costumer_city;
	String customer_contact_no;
	String customer_date_of_birth;
	String occupation;
	
	public Customer() {
		
	}

	public Customer(String customer_number, String firstname, String middlename, String lastname, String costumer_city,
			String customer_contact_no, String customer_date_of_birth, String occupation) {
		super();
		this.customer_number = customer_number;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.costumer_city = costumer_city;
		this.customer_contact_no = customer_contact_no;
		this.customer_date_of_birth = customer_date_of_birth;
		this.occupation = occupation;
	}

	public String getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCostumer_city() {
		return costumer_city;
	}

	public void setCostumer_city(String costumer_city) {
		this.costumer_city = costumer_city;
	}

	public String getCustomer_contact_no() {
		return customer_contact_no;
	}

	public void setCustomer_contact_no(String customer_contact_no) {
		this.customer_contact_no = customer_contact_no;
	}

	public String getCustomer_date_of_birth() {
		return customer_date_of_birth;
	}

	public void setCustomer_date_of_birth(String customer_date_of_birth) {
		this.customer_date_of_birth = customer_date_of_birth;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	

}
