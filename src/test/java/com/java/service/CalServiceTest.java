package com.java.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalServiceTest {

	@Autowired
	CalService service;
	
	
	@Test
	public void testAddition() {
		int number1=12;
		int number2=15;
		int result=27;
		String response="answer : " +result+ ", Detail : " +number1+ " + " +number2+ " = " +result;	
		String actualResult=service.addition(number1, number2);
		assertThat(response).isEqualTo(actualResult);
	}
	
	
	@Test
	public void testSubstration() {
		int number1=12;
		int number2=15;
		int result=-3;
		String response= "answer : " +result+ ", Detail : " +number1+ " - " +number2+ " = " +result;
		String actualResult=service.substraction(number1, number2);
		assertThat(response).isEqualTo(actualResult);
	}
	
	@Test
	public void testMultiplication() {
		int number1=12;
		int number2=15;
		int result=180;
		String response="answer : " +result+ ", Detail : " +number1+ " * " +number2+ " = " +result;	
		String actualResult=service.multiplication(number1, number2);
		assertThat(response).isEqualTo(actualResult);
	}
	
	@Test
	void testDivision() {
		double number1=12;
		double number2=15;
		double result=0.8;
		String response= "answer : " +result+ ", Detail : " +number1+ " / " +number2+ " = " +result;
		String actualResult=service.division(number1, number2);
		assertThat(response).isEqualTo(actualResult);
	}
	
	@Test
	void testSquare() {
		int number1=5;
		int result=25;
		String response="answer : " +result+ ", Detail : "+" square of "+number1+" = " +result;	
		String actualResult=service.square(number1);
		assertThat(response).isEqualTo(actualResult);
	}

	@Test
	void testSquareRoot() {
		double number1=225;
		double result=15;
		String response="answer : " +result+ ", Detail : "+" square Root of "+number1+" = " +result;		
		String actualResult=service.squareRoot(number1);
		assertThat(response).isEqualTo(actualResult);
	}

	@Test
	void testFactorial() {
		int number1=5;
		int result=120;
		String response="answer : " +result+ ", Detail : "+number1+"!= " +result;	
		String actualResult=service.factorial(number1);
		assertThat(response).isEqualTo(actualResult);		
	}

	@Test
	void testCalculateMinMax() {
		Integer[] array = {10,-5,7,15,-7, -6, 16, 19,-15, 9};
		List<Integer> list=Arrays.asList(array);
		int min=-15;
		int max=19;
		String expectedResult="min : "+min+", max : "+max;
		String actualResult=service.calculateMinMax(list);
		assertThat(expectedResult).isEqualTo(actualResult);				
		
	}


}
