package com.example.userservice.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.userservice.dao.CustomerDao;
import com.example.userservice.model.Customer;
import com.example.userservice.model.LoanDto;
import com.example.userservice.model.TransactionDto;

import org.springframework.web.bind.annotation.RequestParam;

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao customerDao;
	
	@Autowired 
	//LoanProxy loanProxy;
	
	public Customer addCustomer(Customer customer) {
		return customerDao.save(customer);
	}
	public LoanDto applyLoan(LoanDto loan) {
		return loanProxy.applyLoan(loan);
	}
	public LoanDto applyLoan(LoanDto loan) {
		return loanProxy.applyLoan(loan);
	}
	public List<TransactionDto> getTransactionsByType(@RequestParam("type") String transaction_type){
		return loanProxy.getTransactionByType(transaction_type);
	}
	public List<Customer> getAllCustomers(){
		return customerDao.findAll();
	}
	
}
