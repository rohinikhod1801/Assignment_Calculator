package com.java.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.java.dao.RequestResponseDao;
import com.java.model.RequestResponse;


@Service
public class CalService {
	
	@Autowired
	private RequestResponseDao dao;
		
	@Cacheable(value = "calculatorCache", key = "'addition:' + #number1 + ':' + #number2", unless = "#result == null")
	public String addition(int number1,int number2) {
		
		String request="number1 : "+number1+", number2 : "+number2;
		int result = number1 + number2;	
		String response="answer : " +result+ ", Detail : " +number1+ " + " +number2+ " = " +result;	
		logRequestResponse(request,response);
		return response;
	}
	
	@Cacheable(value = "calculatorCache", key = "'substration:' + #number1 + ':' + #number2", unless = "#result == null")
	public String substraction(int number1,int number2) {
		
		
		String request="number1 : "+number1+", number2 : "+number2;
		int result = number1 - number2;
		String response= "answer : " +result+ ", Detail : " +number1+ " - " +number2+ " = " +result;
		logRequestResponse(request,response);
		return response;		
	}
	
	@Cacheable(value = "calculatorCache", key = "'multiplication:' + #number1 + ':' + #number2", unless = "#result == null")
	public String multiplication(int number1,int number2) {
		
		
		String request="number1 : "+number1+", number2 : "+number2;
		int result=number1 * number2;	
		String response="answer : " +result+ ", Detail : " +number1+ " * " +number2+ " = " +result;	
		logRequestResponse(request,response);
		return response;	
	}
	
	@Cacheable(value = "calculatorCache", key = "'division:' + #number1 + ':' + #number2", unless = "#result == null")
	public String division(double number1,double number2) {
		
		String request="number1 : "+number1+", number2 : "+number2;
		double result= number1 / number2;	
		String response= "answer : " +result+ ", Detail : " +number1+ " / " +number2+ " = " +result;
		logRequestResponse(request,response);
		
		return 	response;
	}
	
	@Cacheable(value = "calculatorCache", key = "'square:' + #number1 + ':' + #number2", unless = "#result == null")
	public String square(int number1) {
		
		String request="number1 : "+number1;
		int result= number1*number1;		
		String response="answer : " +result+ ", Detail : "+" square of "+number1+" = " +result;	
		logRequestResponse(request,response);
		
		return response; 
	}
	
	@Cacheable(value = "calculatorCache", key = "'squareRoot:' + #number1 + ':' + #number2", unless = "#result == null")
	public String squareRoot(double number1) {
		
		String request="number1 : "+number1;
		double result=Math.sqrt(number1);
		String response="answer : " +result+ ", Detail : "+" square Root of "+number1+" = " +result;	
		logRequestResponse(request,response);
		
		return response;
	}
	
	@Cacheable(value = "calculatorCache", key = "'factorial:' + #number1 + ':' + #number2", unless = "#result == null")
	public String factorial(int number1) {
		 int fact = 1;
	        for (int i = 1; i <= number1; i++) {
	            fact *= i;
	        }
	        int result=fact;
	        String request="number1 : "+number1;
			String response="answer : " +result+ ", Detail : "+number1+"!= " +result;	
			logRequestResponse(request,response);    
		
		return response;
	}
	
	@Cacheable(value = "calculatorCache", key = "'calculateMinMax:' + #number1 + ':' + #number2", unless = "#result == null")
	public String calculateMinMax(List<Integer> list) {
		
		 int min = Collections.min(list);
	     int max = Collections.max(list);
	     String request="List : "+list;
	     String response="min : "+min+", max : "+max;	    
	      logRequestResponse(request,response);
  
	     return response;	
	}


	public void logRequestResponse(String request,String response) {
    RequestResponse log = new RequestResponse();
    log.setRequest(request);
    log.setResponse(response);
    log.setTimestamp(LocalDateTime.now());
    dao.save(log);
}
	
	
}
