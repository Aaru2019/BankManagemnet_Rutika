package com.example.userservice.model;

public class BranchDto {
	String branch_name;
	String branch_city;
	int branch_id;
	public BranchDto() {
		
	}
	public BranchDto(String branch_name, String branch_city) {
		super();
		this.branch_name = branch_name;
		this.branch_city = branch_city;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getBranch_city() {
		return branch_city;
	}
	public void setBranch_city(String branch_city) {
		this.branch_city = branch_city;
	}
	
}
