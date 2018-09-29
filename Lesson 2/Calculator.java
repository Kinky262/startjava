public class Calculator {

	int num1;
	int num2;
	String mathOperation;
	int result = 0;

	public void mathOperations()	{
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
			 result = num1;

			 if (num1 != 0 && num2 == 0) {
				result = 1;
			 } else if (num1 == 0) {
				System.out.println("Zero can not be raised to a power...");
			 } else {
				for (int i = 1; i < num2; i++) {  
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