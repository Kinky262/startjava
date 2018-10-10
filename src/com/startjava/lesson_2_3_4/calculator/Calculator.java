package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private double num1;
	private double num2;
	private String mathOperation;

	public void setNum1(double value) { num1 = value; }

	public void setNum2(double value) {
		num2 = value;
	}

	public void setMathOperation(String value) {
		mathOperation = value;
	}

	public void calculateExpression()	{
		double result = 0;

		switch(mathOperation) {
			case "+":	
				result = num1 + num2;
			    break;
			case "-":	
				result = num1 - num2;
				break;
			case "*":	
				result = num1 * num2;
				break;
			case "/":	
				if (num2 == 0) {
					System.out.println("Division by zero is not allowed!"); 
					return;
			 	} else {
					result = num1 / num2;
			 	}
				break;
			case "^":	
				result = 1;

				if (num1 == 0) {
					System.out.println("Zero can not be raised to a power...");
				} else {
				    result = Math.pow(num1, num2);
				}
	   			break;
			case "%":	
				result = num1 % num2;
				break;						
		}

		System.out.println(num1 + " " + mathOperation + " " + num2 + " = " + String.format("%.2f", result));
	}		
}