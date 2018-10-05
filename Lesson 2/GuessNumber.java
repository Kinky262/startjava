import java.util.Scanner;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;
	private int randomNumber = (int) (Math.random() * 101);
	private Scanner scanPlayerNumber = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		boolean isWin = false;

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

	public boolean compareToTargetNum(Player player) {

		if (player.getNumber() == randomNumber) {
			System.out.println("You WON!\n");
			return true;
		} else if (player.getNumber() < randomNumber) {
			System.out.println("The number you entered is LESS than what the computer\n");
		} else {
			System.out.println("The number you entered is GREATER than what the computer\n");
		}
		return false;
	}
}