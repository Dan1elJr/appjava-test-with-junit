package com.sandaniel.appsdeveloperblog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
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
	void setUp() {
		System.out.println("Executing @BeforeEach method");
		calculator = new Calculator();
	}
	

	@AfterEach
	void cleanUp() {
		System.out.println("Executing @AfterEach method");
	}
	
	
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
	@DisplayName("Test 4/0= ArithmeticException ")
	@Test
	void testIntegerDivision_WhenFourIsDividedByZero_ShouldThrowArithmeticException() {
		//Arrange
		
		int x = 4;
		int y = 0;
		String  expectedExceptionMessage = "/ by zero";
		
		//Act & Assert
		
		ArithmeticException actualException = assertThrows(ArithmeticException.class, ()->{
			
			//Assert
			calculator.integerDivision(x, y);
			
			},"Division by zero should throw an arithmetic exception"
		);
		
		//Act
		
		assertEquals(expectedExceptionMessage,actualException.getMessage(), ()->"Should throw an arithmetic exception");
			
		
		
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
	
	@DisplayName("Square Root of negative number = IllegalArgumentException")
	@Test
	void testDoubleSquareRoot_WhenIllegalParameterInputted_ShouldThrowIllegalArgumentException() {
		
		//Arrange
		double x = -10;
		IllegalArgumentException expectedResult = new IllegalArgumentException();
		
		//Act & Assert
		
		IllegalArgumentException actualResult = assertThrows(IllegalArgumentException.class, ()->{
			calculator.squareRoot(x);
		}
		,()->" Square Root of negative number should throw IllegalArgumentException");
		
		//Assert
		
		
		assertEquals(expectedResult.getClass(), actualResult.getClass(),()->"Should throw an IllegalArgumentException");
		
		
	}
	
	

}
