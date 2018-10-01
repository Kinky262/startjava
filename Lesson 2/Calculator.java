public class Calculator {

	protected int num1;
	protected int num2;
	protected String mathOperation;

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
			default:	
				break;						
		}

		if ((mathOperation.equals("/") && num2 == 0) || (mathOperation.equals("^") && num1 == 0)) {
			System.out.println("No result..."); 
		} else {
			System.out.println(num1 + " " + mathOperation + " " + num2 + " = " + result);
		}	
	}		
}