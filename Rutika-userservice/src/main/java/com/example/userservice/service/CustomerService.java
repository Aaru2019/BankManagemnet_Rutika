package com.example.userservice.service;

import java.util.List;

import com.example.userservice.model.Customer;
import com.example.userservice.model.LoanDto;
import com.example.userservice.model.TransactionDto;

import org.springframework.web.bind.annotation.RequestParam;

public interface CustomerService {
	public Customer addCustomer();
	public List<Customer> getAllCustomers();
	public LoanDto applyLoan(LoanDto loan);
	public List<TransactionDto> getTransactionsByType(@RequestParam("type") String transaction_type);

}
