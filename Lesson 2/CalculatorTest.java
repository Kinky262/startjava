import java.util.Scanner; 

public class CalculatorTest {
	public static void main (String[] args) {
		Calculator calculate = new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a first number: ");
		calculate.num1 = scan.nextInt();
		System.out.print("Enter a sign of math operation: ");
		calculate.mathOperation = scan.next();
		System.out.print("Enter a second number: ");
		calculate.num2 = scan.nextInt();
		calculate.inUse();
	}
}