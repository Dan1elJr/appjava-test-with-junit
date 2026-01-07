package com.sandaniel.appsdeveloperblog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		// Arrange
		
		Calculator calculator = new Calculator();
		
		//Act
		
		int result = calculator.integerDivision(4, 2);
		
		//Assert
		assertEquals(2, result);
	}

}
