package com.java.service;

import org.springframework.stereotype.Service;

@Service
public class CalService {

	public int addition(int number1, int number2) {
		return number1 + number2;
	}

	public int substraction(int number1, int number2) {
		return number1 - number2;
	}

	public int multiplication(int number1, int number2) {
		return number1 * number2;
	}

	public Double division(Double number1, Double number2) {
		return number1 / number2;
	}

	public int square(int number1) {
		return number1 * number1;
	}

	public double squareRoot(double number1) {

		return Math.sqrt(number1);
	}
	
	public int factorial(int number1) {
        int factorial = 1;
        for (int i = 1; i <= number1; i++) {
            factorial *= i;
        }
        return factorial;
    }
	
	
}
