public class Calculator {
	public static void main (String[] args) {
		int num1 = 9;
		int num2 = 3;
		char mathOperation = '/'; // присваеваем переменной значение математической операции
		int result = 0;

		if (mathOperation == '+') {
			result = num1 + num2;
		} else if (mathOperation == '-') {
			result = num1 - num2;
		} else if (mathOperation == '*') {
			result = num1 * num2;
		} else if (mathOperation == '/' && num2 == 0) {
			System.out.println("Division by zero is not allowed!"); 
		} else if (mathOperation == '/' && num2 != 0) {				
			result = num1 / num2;
		} else if (mathOperation == '^') {
			result = num1;

			if (num1 != 0 && num2 == 0) {
				result = 1;
			} else if (num1 == 0) {
				System.out.println("zero can not be raised to a power...");
			} else {
				for (int i = 1; i < num2; i++) {  
					result *= num1;
				}
		    }
		} else if (mathOperation == '%') {
			result = num1 % num2;
		}

		if ((mathOperation == '/' && num2 == 0) || (mathOperation == '^' && num1 == 0)) {
			System.out.println("No result...");
		} else {
			System.out.println(num1 + " " + mathOperation + " " + num2 + " = " + result);
		}
	}
}