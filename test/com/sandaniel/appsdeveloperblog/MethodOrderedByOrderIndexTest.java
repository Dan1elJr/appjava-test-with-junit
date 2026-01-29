package com.sandaniel.appsdeveloperblog;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderIndexTest {
	
	StringBuilder completed = new StringBuilder("");
	
	@AfterEach
	void afterEach() {
		System.out.println("The state of instance object is: "+completed);
	}
	
	@Order(1)
	@Test
	void testC() {
		System.out.println("Running test C");
		
		completed.append("1");
		
		
		
	}
	
	@Order(3)
	@Test
	void testA() {
		System.out.println("Running test A");
		completed.append("3");
	}
	
	@Order(2)
	@Test
	void testB() {
		System.out.println("Running test B");
		completed.append("2");
	}
	
}
