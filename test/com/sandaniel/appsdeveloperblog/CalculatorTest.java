package com.sandaniel.appsdeveloperblog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math operations in calculator class")
class CalculatorTest {

	Calculator calculator;
	
	//LifeCycle annotations
	@BeforeAll
	static void setup() {
		System.out.println("Executing @BeforeAll method");
	}
	
	@AfterAll
	static void cleanup() {
		System.out.println("Executing @AfterAll method");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Executing @BeforeEach method");
		calculator = new Calculator();
	}
	

	@AfterEach
	public void cleanUp() {
		System.out.println("Executing @AfterEach method");
	}
	@Disabled("TODO on this")
	@DisplayName("Test 4/2=2")
	@Test
	void testIntegerDivision_WhenFourIsDividedTwo_ShouldReturnTwo() {
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
	
	@DisplayName("Test 10-2=8")
	@Test
	void testIntegerSubtraction_WhenTenIsSubctratedForTwo_ShouldReturnEigth() {
		//Arrange
		
		int x = 10;
		int y = 2;
		int expectedResult = 8;
		
		//Act
		int result = calculator.integerSubtraction(x, y);
		
		//Assert
		assertEquals(expectedResult, result,
				()->"The result of "+x+"-"+y+" must be "+expectedResult+", and it is not!");
	}

}
