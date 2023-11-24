package com.java.controller;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;


@SpringBootTest
class CalControllerTest {

	@Autowired
	private CalController cal;
	
	@Test
	void testAddition() {
		int number1=12;
		int number2=15;
		int result=27;
		String expectedResult="answer : " +result+ ", Detail : " +number1+ " + " +number2+ " = " +result;	
		ResponseEntity<String> actualResult=cal.addition(number1, number2);
		assertThat(expectedResult).isEqualTo(actualResult.getBody());
		
	}

	@Test
	void testSubtration() {
		int number1=12;
		int number2=15;
		int result=-3;
		String expectedResult="answer : " +result+ ", Detail : " +number1+ " - " +number2+ " = " +result;	
		ResponseEntity<String> actualResult=cal.substraction(number1, number2);
		assertThat(expectedResult).isEqualTo(actualResult.getBody());
	}

	@Test
	void testMultiplication() {
		int number1=12;
		int number2=15;
		int result=180;
		String expectedResult="answer : " +result+ ", Detail : " +number1+ " * " +number2+ " = " +result;	
		ResponseEntity<String> actualResult=cal.multiplication(number1, number2);
		assertThat(expectedResult).isEqualTo(actualResult.getBody());
	}

	@Test
	void testDivision() {
		double number1=12;
		double number2=15;
		double result=0.8;
		String expectedResult="answer : " +result+ ", Detail : " +number1+ " / " +number2+ " = " +result;	
		ResponseEntity<String> actualResult=cal.division(number1, number2);
		assertThat(expectedResult).isEqualTo(actualResult.getBody());
	}

	@Test
	void testSquare() {
		int number1=5;
		int result=25;
		String expectedResult="answer : " +result+ ", Detail : "+" square of "+number1+" = " +result;	
		ResponseEntity<String> actualResult=cal.square(number1);
		assertThat(expectedResult).isEqualTo(actualResult.getBody());
	}

	@Test
	void testSquareRoot() {
		double number1=225;
		double result=15;
		String expectedResult="answer : " +result+ ", Detail : "+" square Root of "+number1+" = " +result;		
		ResponseEntity<String> actualResult=cal.squareRoot(number1);
		assertThat(expectedResult).isEqualTo(actualResult.getBody());
	}

	@Test
	void testFactorial() {
		int number1=5;
		int result=120;
		String expectedResult="answer : " +result+ ", Detail : "+number1+"!= " +result;		
		ResponseEntity<String> actualResult=cal.factorial(number1);
		assertThat(expectedResult).isEqualTo(actualResult.getBody());		
	}

	@Test
	void testCalculateMinMax() {
		Integer[] array = {10,-5,7,15,-7, -6, 16, 19,-15, 9};
		List<Integer> list=Arrays.asList(array);
		int min=-15;
		int max=19;
		String expectedResult="min : "+min+", max : "+max;
		ResponseEntity<String> actualResult=cal.calculateMinMax(list);
		assertThat(expectedResult).isEqualTo(actualResult.getBody());				
		
	}

} 
