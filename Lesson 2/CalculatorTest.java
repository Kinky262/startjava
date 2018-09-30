import java.util.Scanner; 

public class CalculatorTest {
	public static void main (String[] args) {
		String userAnswer = "y";		
		Calculator calculate = new Calculator();
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter a first number: ");
			calculate.num1 = scan.nextInt();
			System.out.print("Enter a sign of math operation: ");
			calculate.mathOperation = scan.next();
			System.out.print("Enter a second number: ");
			calculate.num2 = scan.nextInt();
			calculate.mathOperations();

			do {
				System.out.print("Would you like to continue? [Y/N]: ");
				userAnswer = scan.next();	

				if (userAnswer.equals("Y") || userAnswer.equals("y")|| userAnswer.equals("N") || userAnswer.equals("n")) {
					break;
				}

			} while (!userAnswer.equals("Y") || !userAnswer.equals("y")|| !userAnswer.equals("N") || !userAnswer.equals("n"));
		} while (userAnswer.equals("Y") || userAnswer.equals("y"));
	}
}