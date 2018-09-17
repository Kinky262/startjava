public class Calculator {
	public static void main (String[] args) {
		int num1 = 16;
		int num2 = 0;
		char op = '/'; // присваеваем переменной значение математической операции
		int result = 0;

		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/' && num2 == 0) {
			System.out.println("This operation is not allowed!"); 
		} else if (op == '/' && num2 != 0) {				
			result = num1 / num2;
		} else if (op == '^') {
			result = num1;

			if (num1 != 0 && num2 == 0) {
				result = 1;
			} else if (num1 == 0) {
				System.out.println("zero can not be raised to a power...");
			} else {
			for (int i = 1; i <= num2 && num1 != 0 && num2 != 0; i++) {
				result *= num1;
			}
		    }
		} else if (op == '%') {
			result = num1 % num2;
		}
		if ((op == '/' && num2 == 0) || (op == '^' && num1 == 0)) {
			System.out.println("No result...");
		} else {
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		}
	}
}