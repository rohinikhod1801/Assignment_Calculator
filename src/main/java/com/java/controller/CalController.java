package com.java.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {
	
	@GetMapping("/calculatorapi/v1/addition")
	public String addition(@RequestParam int number1, @RequestParam int number2) {
		
		int result = number1 + number2;
		String addition="answer : " +result+ ", Detail : " +number1+ " + " +number2+ " = " +result;	
		
		return 	addition;
	}

	@GetMapping("/calculatorapi/v1/subtration")
	public String subtration(@RequestParam int number1, @RequestParam int number2) {
		
		int result = number1 - number2;
		String subtration= "answer : " +result+ ", Detail : " +number1+ " - " +number2+ " = " +result;
		return subtration;		
	}
	
	@GetMapping("/calculatorapi/v1/multiplication")
	public String multiplication(@RequestParam int number1, @RequestParam int number2) {
		
		int result=number1 * number2;
		String multiplication="answer : " +result+ ", Detail : " +number1+ " * " +number2+ " = " +result;	
		return multiplication;
	}
	
	@GetMapping("/calculatorapi/v1/division")
	public String division(@RequestParam double number1, @RequestParam double number2) {
		
		double result=number1 / number2;
		String division= "answer : " +result+ ", Detail : " +number1+ " / " +number2+ " = " +result;	
		return division;
	}
	
	@GetMapping("/calculatorapi/v1/square/{number1}")
	public String square(@PathVariable int number1) {
		
		int result= number1 * number1;
		String square="answer : " +result+ ", Detail : "+" square of "+number1+" = " +result;	
		return square;
	}
	
	@GetMapping("/calculatorapi/v1/squareRoot/{number1}")
	public String squareRoot(@PathVariable double number1) {
		
		double result=Math.sqrt(number1);
		String squareRoot="answer : " +result+ ", Detail : "+" square Root of "+number1+" = " +result;	
		return squareRoot;
	}
	
	@GetMapping("/calculatorapi/v1/factorial/{number1}")
	public String factorial(@PathVariable int number1) {
		
		 int fact = 1;
	        for (int i = 1; i <= number1; i++) {
	            fact *= i;
	        }
		int result=fact;
		String factorial="answer : " +result+ ", Detail : "+number1+"!= " +result;		
		return factorial;
	}

	@PostMapping("/calculatorapi/v1/min")
    public String calculateMinMax(@RequestBody List<Integer> list ) {
     
        int min = Collections.min(list);
        int max = Collections.max(list);

        return "min : "+min+", max : "+max;
    }
	
	
}
