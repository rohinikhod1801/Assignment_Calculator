package com.java.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RequestResponseTest {

	@InjectMocks
	private RequestResponse response;
	
	
	@Test
	public void testSetRequest() {
		response.setRequest("number1 : 12, number2 : 15");
		assertEquals("number1 : 12, number2 : 15", response.getRequest());
	}
	
	@Test
	public void testGetRequest() {
		response.setRequest("number1 : 12, number2 : 15");
		assertEquals("number1 : 12, number2 : 15", response.getRequest());
	}
	
	@Test
	public void testSetResponse() {
		response.setResponse("answer : 27, Detail : 12 + 15 = 27");
		assertEquals("answer : 27, Detail : 12 + 15 = 27", response.getResponse());
	}
	
	@Test
	public void testGetResponse() {
		response.setResponse("answer : 27, Detail : 12 + 15 = 27");
		assertEquals("answer : 27, Detail : 12 + 15 = 27", response.getResponse());
	}
	
}
