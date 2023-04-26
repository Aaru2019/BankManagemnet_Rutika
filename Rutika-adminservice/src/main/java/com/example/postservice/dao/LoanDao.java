package com.example.postservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postservice.model.Loan;

public interface LoanDao extends JpaRepository<Loan,String> {

}
