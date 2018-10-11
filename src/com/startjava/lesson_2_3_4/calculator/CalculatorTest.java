package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main (String[] args) {
		String userAnswer = "y";
		CalculatorTest calculatorTest = new CalculatorTest();
		Calculator myCalculator = new Calculator();
		Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите математическое выражение: ");
            calculatorTest.setValues(myCalculator, calculatorTest.receiveExpression(scan.nextLine()));
			myCalculator.calculateExpression();

			do {
				System.out.print("Would you like to continue? [Y/N]: ");
				userAnswer = scan.nextLine();
			} while (!userAnswer.equals("Y") && !userAnswer.equals("y") && !userAnswer.equals("N") && !userAnswer.equals("n"));
		} while (userAnswer.equals("Y") || userAnswer.equals("y"));
	}

    public String[] receiveExpression(String scan) {
        String[] expression = scan.split(" ");
        return expression;
    }

    public void setValues(Calculator myCalculator, String[] expression) {
        myCalculator.setNum1(Integer.parseInt(expression[0]));
        myCalculator.setMathOperation(expression[1]);
        myCalculator.setNum2(Integer.parseInt(expression[2]));
    }
}