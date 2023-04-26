package com.example.postservice.model;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="loan_details")
public class Loan {
	@Id
	String customer_number;
	@Id
	String branch_id;
	
	int load_amount;
	
	public Loan() {
		
	}

	public Loan(String customer_number, String branch_id, int load_amount) {
		super();
		this.customer_number = customer_number;
		this.branch_id = branch_id;
		this.load_amount = load_amount;
	}

	public String getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}

	public String getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(String branch_id) {
		this.branch_id = branch_id;
	}

	public int getLoad_amount() {
		return load_amount;
	}

	public void setLoad_amount(int load_amount) {
		this.load_amount = load_amount;
	}
	
}
