package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main (String[] args) {
		String userAnswer;
		Calculator myCalculator = new Calculator();
		Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Введите математическое выражение: ");
            init(myCalculator, receiveExpression(scan.nextLine()));
			myCalculator.calculateExpression();

			do {
				System.out.print("Would you like to continue? [Y/N]: ");
				userAnswer = scan.nextLine();
			} while (!userAnswer.equals("Y") && !userAnswer.equals("y") &&
                    !userAnswer.equals("N") && !userAnswer.equals("n"));
		} while (userAnswer.equals("Y") || userAnswer.equals("y"));
	}

    private static String[] receiveExpression(String scan) {
	    return scan.split(" ");
    }

    private static void init(Calculator myCalculator, String[] expression) {
        myCalculator.setNum1(Integer.parseInt(expression[0]));
        myCalculator.setMathOperation(expression[1]);
        myCalculator.setNum2(Integer.parseInt(expression[2]));
    }
}