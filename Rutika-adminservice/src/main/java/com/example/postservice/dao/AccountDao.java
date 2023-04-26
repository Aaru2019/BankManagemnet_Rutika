package com.example.postservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postservice.model.Account;

public interface AccountDao extends JpaRepository<Account,String> {

}
