public class Calculator {
	public static void main (String[] args) {
		int num1 = 9;
		int num2 = 3;
		char opAdd = '+';
		char opSubtr = '-';
		char opMult = '*';
		char opDiv = '/';
		char opExp = '^';
		char opDivMod = '%';
		char op = opMult; // присваеваем операцию из объявленных выше
		int result = 0;

		if (op == opAdd) {
			result = num1 + num2;
		} else if (op == opSubtr) {
			result = num1 - num2;
		} else if (op == opMult) {
			result = num1 * num2;
		} else if (op == opDiv) {
			result = num1 / num2;
		} else if (op == opExp) {
			result = num1;
			for (int i = 1; i<num2; i++) {
				result *= num1;
			}
		} else if (op == opDivMod) {
			result = num1 % num2;
		}
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
}