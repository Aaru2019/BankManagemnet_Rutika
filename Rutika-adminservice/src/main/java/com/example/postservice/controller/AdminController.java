package com.example.postservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.postservice.model.Account;
import com.example.postservice.model.Branch;
import com.example.postservice.model.Loan;
import com.example.postservice.model.Transaction;
import com.example.postservice.service.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.DeleteMapping;


public class AdminController {
	@Autowired
	AdminService service;
	
	
	@GetMapping()
	public List<Branch> showAllBranches1(){
		return service.getAllBranches();
	}
		
	
	
	@GetMapping("/allBranches")
	public List<Branch> showAllBranches(){
		return service.getAllBranches();
	}
	
	@GetMapping("/allCustomers")
	public List<CustomerDto> getAllCustomers(){
		return service.getAllCustomers();
	}
	@GetMapping("/allLoans")
	public List<Loan> getAllLoans(){
		return service.getAllLoans();
	}
	@PostMapping("/addAccount")
	public Account addAccount(@RequestBody Account account) {
		return service.insertAccount(account);
	}
	@PostMapping("/addBranch")
	public Branch addBrach(@RequestBody Branch branch) {
		return service.insertBranch(branch);
	}
	@DeleteMapping("/deleteAccount/{account_number}")
	public String delteAccount(@PathVariable("account_number")String account_number) {
		return service.deleteAccount(account_number);
	}
	@DeleteMapping("/delteBranch/{branch_id}")
	public String deleteBranch(@PathVariable("branch_id") String branch_id) {
	return service.deleteBranch(branch_id);
	}
	@DeleteMapping("/deleteCustomer/{customer_number}")
	public String deleteCustomer(@PathVariable("customer_number")String customer_number) {
		return service.deleteCustomer(customer_number);
	}
	

}
