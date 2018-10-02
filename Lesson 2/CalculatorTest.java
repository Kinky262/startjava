import java.util.Scanner; 

public class CalculatorTest {
	public static void main (String[] args) {
		String userAnswer = "y";		
		Calculator myCalculator = new Calculator();
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter a first number: ");
			myCalculator.setNum1(scan.nextInt());
			System.out.print("Enter a sign of math operation: ");
			myCalculator.setMathOperation(scan.next());
			System.out.print("Enter a second number: ");
			myCalculator.setNum2(scan.nextInt());
			myCalculator.calculateExpression();

			do {
				System.out.print("Would you like to continue? [Y/N]: ");
				userAnswer = scan.next();	
			} while ((!userAnswer.equals("Y") || !userAnswer.equals("y")) && (!userAnswer.equals("N") || !userAnswer.equals("n")));
		} while (userAnswer.equals("Y") || userAnswer.equals("y"));
	}
}