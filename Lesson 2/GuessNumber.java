import java.util.Scanner;

public class GuessNumber {
	Player playerOne;
	Player playerTwo;
	static int randomNumber = (int) (Math.random() * 101);


	public GuessNumber(Player one, Player two) {
		playerOne = one;
		playerTwo = two;
	}

	public void startGame() {
		boolean isWin = false;
		Scanner scanPlayerNumber = new Scanner(System.in);

		System.out.println("\nEnter a number (0-100)." + "\n");

		while(isWin == false) {
			System.out.print(playerOne.getPlayerName() + ": ");
			playerOne.setNumber(scanPlayerNumber.nextInt());
			isWin = compareToTargetNum(playerOne);
		
			if (isWin == true) {
				return;
			} 
			System.out.print(playerTwo.getPlayerName() + ": ");
			playerTwo.setNumber(scanPlayerNumber.nextInt());
			isWin = compareToTargetNum(playerTwo);
		}
	}

	public boolean compareToTargetNum(Player x) {
		Player player = x;

		if (player.getNumber() == randomNumber) {
			System.out.println("You WON!\n");
			return true;
		} else if (player.getNumber() < randomNumber) {
			System.out.println("The number you entered is LESS than what the computer\n");
			return false;
		} else {
			System.out.println("The number you entered is GREATER than what the computer\n");
			return false;
		}
	}
}