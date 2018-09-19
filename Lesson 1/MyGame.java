public class MyGame {
	public static void main (String[] args) {
		int computerNumber = 42; 
		int userNumber = 27; 

		if (computerNumber == userNumber) {
			System.out.println("You won!");
		} else if (computerNumber > userNumber) {
			System.out.println("The number you entered is less than what the computer");
		} else {
			System.out.println("The number you entered is greater than what the computer");
		} 		
	}
}