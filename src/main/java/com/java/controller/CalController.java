package com.java.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.service.CalService;

@RestController
public class CalController {

	@Autowired
	CalService service;

	private static final Logger LOG = LoggerFactory.getLogger(CalController.class);

	@GetMapping("/calculatorapi/v1/addition")
	public ResponseEntity<String> addition(@RequestParam int number1, @RequestParam int number2) {
		try {
			String response = service.addition(number1, number2);
			LOG.info("Addition method: " + response);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			LOG.error("Error occurred while performing addition", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while performing addition");
		}
	}

	@GetMapping("/calculatorapi/v1/subtraction")
	public ResponseEntity<String> substraction(@RequestParam int number1, @RequestParam int number2) {
		try {
			String response = service.substraction(number1, number2);
			LOG.info("Subtraction method: " + response);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			LOG.error("Error occurred while performing subtraction", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while performing subtraction");
		}
	}

	@GetMapping("/calculatorapi/v1/multiplication")
	public ResponseEntity<String> multiplication(@RequestParam int number1, @RequestParam int number2) {
		try {
			String response = service.multiplication(number1, number2);
			LOG.info("Multiplication method: " + response);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			LOG.error("Error occurred while performing multiplication", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while performing multiplication");
		}
	}

	@GetMapping("/calculatorapi/v1/division")
	public ResponseEntity<String> division(@RequestParam double number1, @RequestParam double number2) {
		try {
			String response = service.division(number1, number2);
			LOG.info("Division method: " + response);
			return ResponseEntity.ok(response);
		} catch (ArithmeticException e) {
			LOG.error("Arithmetic error occurred while performing division", e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Arithmetic error: " + e.getMessage());
		} catch (Exception e) {
			LOG.error("Error occurred while performing division", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while performing division");
		}
	}

	@GetMapping("/calculatorapi/v1/square/{number1}")
	public ResponseEntity<String> square(@PathVariable int number1) {
		try {
			String response = service.square(number1);
			LOG.info("Square method: " + response);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			LOG.error("Error occurred while performing square operation", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while performing square operation");
		}
	}

	@GetMapping("/calculatorapi/v1/squareRoot/{number1}")
	public ResponseEntity<String> squareRoot(@PathVariable double number1) {
		try {
			String response = service.squareRoot(number1);
			LOG.info("SquareRoot method: " + response);
			return ResponseEntity.ok(response);
		} catch (ArithmeticException e) {
			LOG.error("Arithmetic error occurred while computing square root", e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Arithmetic error: " + e.getMessage());
		} catch (Exception e) {
			LOG.error("Error occurred while computing square root", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while computing square root");
		}
	}

	@GetMapping("/calculatorapi/v1/factorial/{number1}")
	public ResponseEntity<String> factorial(@PathVariable int number1) {
		try {
			String response = service.factorial(number1);
			LOG.info("Factorial method: " + response);
			return ResponseEntity.ok(response);
		} catch (IllegalArgumentException e) {
			LOG.error("Invalid argument for factorial calculation", e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body("Invalid argument for factorial calculation: " + e.getMessage());
		} catch (Exception e) {
			LOG.error("Error occurred while computing factorial", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while computing factorial");
		}
	}

	@PostMapping("/calculatorapi/v1/min-max")
	public ResponseEntity<String> calculateMinMax(@RequestBody List<Integer> list) {
		try {
			String response = service.calculateMinMax(list);
			LOG.info("CalculateMinMax method: " + response);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			LOG.error("Error occurred while calculating MinMax", e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while calculating MinMax");
		}
	}
}
