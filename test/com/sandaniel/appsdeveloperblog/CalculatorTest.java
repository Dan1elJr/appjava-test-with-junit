package com.sandaniel.appsdeveloperblog;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	public void setUp() {
		
		calculator = new Calculator();
	}
	
	@Test
	void divisionTest() {
	
		//Act
		
		int result = calculator.integerDivision(4, 2);
		
		//Assert
		assertEquals(2, result," The result of 4/2 must be 2, and it is not!");	
	}
	
	@Test
	void subtractionTest() {
		
		//Act
		int result = calculator.integerSubtraction(10, 2);
		
		//Assert
		assertEquals(8, result, "The result of 10-2 must be 5, and it is not!");
	}

}
