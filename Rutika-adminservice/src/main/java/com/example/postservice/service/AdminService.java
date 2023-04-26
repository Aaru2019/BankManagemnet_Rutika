package com.example.postservice.service;

import java.util.List;

import com.example.postservice.controller.CustomerDto;
import com.example.postservice.model.Account;
import com.example.postservice.model.Branch;
import com.example.postservice.model.Customer;
import com.example.postservice.model.Loan;

import java.util.*;

public interface AdminService {
	public List<Account>getAllAcounts();
	public List<CustomerDto> getAllCustomers();
	public List<Branch> getAllBranches();
	public List<Loan> getAllLoans();
	public Account insertAccount(Account acc);
	public Branch insertBranch(Branch branch);
	public String deleteAccount(String account_number);
	public String deleteBranch(String branch_id);
	public String deleteCustomer(String customer_number);
	public List<Customer> findCustomerByCid(String customer_number);

}
