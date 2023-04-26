package com.example.postservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postservice.model.Branch;

public interface BranchDao extends JpaRepository<Branch,String> {

}
