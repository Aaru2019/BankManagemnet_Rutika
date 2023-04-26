
package com.example.postservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.postservice.dao.AccountDao;
import com.example.postservice.dao.BranchDao;
import com.example.postservice.model.Account;
import com.example.postservice.model.Branch;
import com.example.postservice.model.Customer;
import com.example.postservice.model.Loan;
import com.example.postservice.controller.CustomerDto;
import com.example.postservice.dao.*;

public class AdminServiceImpl implements AdminService{
	@Autowired
	AccountDao accountDao;
	
	@Autowired
	BranchDao branchDao;
	
	@Autowired
	LoanDao loanDao;
	
	@Autowired
	TransactionDao transactionDao;
	
	
	
	public List<Account> getAllAccounts(){
		return accountDao.findAll();
		
	}
	
	public List<Loan> getAllLoans(){
		return loanDao.findAll();
		
	}
	
	public Account insertAccount(Account account) {
		return accountDao.save(account);
		
	}
	public Branch insertBranch(Branch branch) {
		return branchDao.save(branch);
	}
	public String deleteCustomer(String customer_number) {
		return null;
	}

	@Override
	public List<Account> getAllAcounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDto> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Branch> getAllBranches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAccount(String account_number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteBranch(String branch_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> findCustomerByCid(String customer_number) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
