public class MyGame {
	public static void main (String[] args) {
		int computerNumber = 42; 
		int userNumber = 18; 
		boolean isWin = false;
		int lowerUserNum = 0;
		int upperUserNum = 100;

		while (true) {
			System.out.println("You entered: " + userNumber);

			if (computerNumber == userNumber) {
				System.out.println("You won!\n");
				isWin = true;
				break;
			} else if (computerNumber > userNumber) {
				lowerUserNum = userNumber;
				System.out.println("The number you entered is LESS than what the computer\n");

				if ((userNumber + 14) <= 100 && (userNumber + 14) <= upperUserNum) {
					userNumber = userNumber + 14;					
				} else if ((userNumber + 9) <= 100 && (userNumber + 9) <= upperUserNum) {
					userNumber = userNumber + 9;		
				} else {
					userNumber++;
				}
			} else {
				upperUserNum = userNumber;				
				System.out.println("The number you entered is GREATER than what the computer\n");

				if ((userNumber - 15) >= 0 && (userNumber - 15) >= lowerUserNum) {
					userNumber = userNumber - 15;					
				} else if ((userNumber - 10) >= 0 && (userNumber - 10) >= lowerUserNum) {
					userNumber = userNumber - 10;					
				} else {
					userNumber--;
				}
			}
		} 		
	}
}