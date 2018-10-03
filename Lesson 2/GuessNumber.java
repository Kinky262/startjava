import java.util.Scanner;

public class GuessNumber {
	Player playerOne;
	Player playerTwo;

	public GuessNumber(Player one, Player two) {
		playerOne = one;
		playerTwo = two;
	}

	public void startGame() {
		int playersGuess = 0;
		boolean isWin = false;
		int randomNumber = (int) (Math.random() * 101);
		Scanner scanPlayerNumber = new Scanner(System.in);

		System.out.println("\nEnter a number (0-100)." + "\n");

		while(isWin == false) {
			System.out.print(playerOne.getPlayerName() + ": ");
			playerOne.setNumber(scanPlayerNumber.nextInt());
			playersGuess = playerOne.getNumber();
			isWin = compareToTargetNum(playerOne, playersGuess, randomNumber);
		
			if (isWin == true) {
				return;
			} 
			System.out.print(playerTwo.getPlayerName() + ": ");
			playerTwo.setNumber(scanPlayerNumber.nextInt());
			playersGuess = playerTwo.getNumber();
			isWin = compareToTargetNum(playerTwo, playersGuess, randomNumber);
		}
	}

	public boolean compareToTargetNum (Player player, int playersGuess, int randomNumber) {
		boolean isRight = false;

			if (playersGuess == randomNumber) {
				isRight = true;
			}
			if (playersGuess < randomNumber) {
				System.out.println("The number you entered is LESS than what the computer\n");
			}
			if (playersGuess > randomNumber) {
				System.out.println("The number you entered is GREATER than what the computer\n");
			}
			if (isRight) {
				System.out.println("You WON!\n");
			}
			return isRight;
	}
}