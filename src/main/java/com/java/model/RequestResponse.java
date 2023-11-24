package com.java.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class RequestResponse {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String request;
	public String response;
	public LocalDateTime timestamp;

}
