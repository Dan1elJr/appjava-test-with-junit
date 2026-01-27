package com.sandaniel.appsdeveloperblog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class DemoRepeatedTest {
	
	Calculator calculator;
	
	@BeforeEach
	void setup() {
	    this.calculator = new Calculator();
	}

	
	@DisplayName("Test 4/0= ArithmeticException ")
	@RepeatedTest(value=3, name="{displayName}. Repetition {currentRepetition} of "+"{totalRepetitions}")
	void testIntegerDivision_WhenFourIsDividedByZero_ShouldThrowArithmeticException(RepetitionInfo repetitionInfo, TestInfo testInfo) {
		
		System.out.println("Running #"+ repetitionInfo.getCurrentRepetition()+" of "+repetitionInfo.getTotalRepetitions());
		System.out.println("Repetiton "+testInfo.getTestMethod().get().getName());
		
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
}
