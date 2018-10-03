import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Player playerOne = new Player();
		Player playerTwo = new Player();
		GuessNumber game = new GuessNumber(playerOne, playerTwo);
		String userAnswer = "y";
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter Player_One name: ");
			playerOne.setPlayerName(scan.next());
			System.out.print("Enter Player_Two name: ");
			playerTwo.setPlayerName(scan.next());
			game.startGame();

			do {
				System.out.print("Would you like to continue? [Y/N]: ");
				userAnswer = scan.next();	
			} while (!userAnswer.equals("Y") && !userAnswer.equals("y") && !userAnswer.equals("N") && !userAnswer.equals("n"));
		} while (userAnswer.equals("Y") || userAnswer.equals("y"));		
	}
}