package com.java.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "requestresponse")
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
