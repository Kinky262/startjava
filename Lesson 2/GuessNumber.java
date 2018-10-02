public class GuessNumber {
	private Player p1;
	private Player p2;

	public void startGame() {
		int guessp = 0;
		boolean isWin = false;
		int targetNumber = (int) (Math.random() * 101);
		p1 = new Player("Player1");
		p2 = new Player("Player2");

		System.out.println("\nEnter a number (0-100)." + targetNumber + "\n");

		while(isWin == false) {
			System.out.print(p1.getPlayerName() + ": ");
			p1.guess();
			guessp = p1.getNumber();
			isWin = compareToTargetNum(p1, guessp, targetNumber);
		
			if (isWin == true) {
				return;
			} 
			System.out.print(p2.getPlayerName() + ": ");
			p2.guess();
			guessp = p2.getNumber();
			isWin = compareToTargetNum(p2, guessp, targetNumber);
		}
	}

	public boolean compareToTargetNum (Player player, int guessp, int targetNumber) {
		boolean isRight = false;

			if (guessp == targetNumber) {
				isRight = true;
			}
			if (guessp < targetNumber) {
				System.out.println("The number you entered is LESS than what the computer\n");
			}
			if (guessp > targetNumber) {
				System.out.println("The number you entered is GREATER than what the computer\n");
			}
			if (isRight) {
				System.out.println("You WON!\n");
			}
			return isRight;
	}
}