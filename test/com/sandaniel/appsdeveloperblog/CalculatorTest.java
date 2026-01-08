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
		//Arrange
		
		int x = 4;
		int y = 2;
		int expectedResult = 2;
		
		//Act
		
		int result = calculator.integerDivision(x, y);
		
		//Assert
		assertEquals(expectedResult, result,
				()->"The result of "+x+"/"+y+" must be "+expectedResult+", and it is not!");	
	}
	
	@Test
	void subtractionTest() {
		//Arrange
		
		int x = 10;
		int y = 5;
		int expectedResult = 8;
		
		//Act
		int result = calculator.integerSubtraction(x, y);
		
		//Assert
		assertEquals(expectedResult, result,
				()->"The result of "+x+"-"+y+" must be "+expectedResult+", and it is not!");
	}

}
