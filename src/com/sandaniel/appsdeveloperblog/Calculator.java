package com.sandaniel.appsdeveloperblog;

public class Calculator {
	
	public int integerDivision(int x, int y) {
		return x / y;
	}
	
	public int integerSubtraction (int x , int y) {
		return x - y; 
	}
	
	public double squareRoot(double number)  {
		
		double theNumber = number;
		
		if (theNumber<0) {
			throw new IllegalArgumentException("Cannot calculate square root of a negative number");	
		}
		
		return Math.sqrt(theNumber);
	}
}
