package com.sandaniel.appsdeveloperblog;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		// Arrange
		
		Calculator calculator = new Calculator();
		
		//Act
		
		int result = calculator.integerDivision(4, 2);
		
		//Assert
		assertEquals(2, result-1," The result of 4/2 must be 2, and it is not!");
	}

}
