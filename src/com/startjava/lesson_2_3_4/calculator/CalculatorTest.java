package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main (String[] args) {
		String userAnswer = "y";		
		Calculator myCalculator = new Calculator();
		Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите математическое выражение: ");
            String[] expression = scan.nextLine().split(" ");
			myCalculator.setNum1(Double.parseDouble(expression[0]));
			myCalculator.setMathOperation(expression[1]);
			myCalculator.setNum2(Double.parseDouble(expression[2]));
			myCalculator.calculateExpression();

			do {
				System.out.print("Would you like to continue? [Y/N]: ");
				userAnswer = scan.nextLine();
			} while (!userAnswer.equals("Y") && !userAnswer.equals("y") && !userAnswer.equals("N") && !userAnswer.equals("n"));
		} while (userAnswer.equals("Y") || userAnswer.equals("y"));
	}
}