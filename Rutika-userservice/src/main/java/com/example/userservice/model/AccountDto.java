package com.example.userservice.model;

public class AccountDto {

	String account_number;
	String customer_number;
	String branch_id;
	int opening_balance;
	String account_opening_data;
	String account_type;
	String account_status;
	
	public AccountDto() {
		
	}

	public AccountDto(String account_number, String customer_number, String branch_id, int opening_balance,
			String account_opening_data, String account_type, String account_status) {
		super();
		this.account_number = account_number;
		this.customer_number = customer_number;
		this.branch_id = branch_id;
		this.opening_balance = opening_balance;
		this.account_opening_data = account_opening_data;
		this.account_type = account_type;
		this.account_status = account_status;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
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

	public int getOpening_balance() {
		return opening_balance;
	}

	public void setOpening_balance(int opening_balance) {
		this.opening_balance = opening_balance;
	}

	public String getAccount_opening_data() {
		return account_opening_data;
	}

	public void setAccount_opening_data(String account_opening_data) {
		this.account_opening_data = account_opening_data;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_status() {
		return account_status;
	}

	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	
}
