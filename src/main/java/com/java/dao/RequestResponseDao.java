package com.java.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.RequestResponse;

@Repository
public interface RequestResponseDao extends JpaRepository<RequestResponse, Long> {
	
}
