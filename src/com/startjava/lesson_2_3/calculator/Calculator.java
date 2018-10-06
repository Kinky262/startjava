package com.startjava.lesson_2_3.calculator;

public class Calculator {
	private int num1;
	private int num2;
	private String mathOperation;

	public void setNum1(int value) {
		num1 = value;
	}

	public void setNum2(int value) {
		num2 = value;
	}

	public void setMathOperation(String value) {
		mathOperation = value;
	}

	public void calculateExpression()	{
		int result = 0;

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
					for (int i = 0; i < num2; i++) {  
						result *= num1;
					}
				}
	   			break;
			case "%":	
				result = num1 % num2;
				break;						
		}

		System.out.println(num1 + " " + mathOperation + " " + num2 + " = " + result);	
	}		
}