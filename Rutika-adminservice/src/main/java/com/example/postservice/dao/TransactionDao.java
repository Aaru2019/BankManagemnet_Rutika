package com.example.postservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postservice.model.Transaction;

public interface TransactionDao extends JpaRepository<Transaction,String> {

}
