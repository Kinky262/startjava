import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumber game = new GuessNumber();
		String userAnswer = "y";
		Scanner scan = new Scanner(System.in);

		do {
			game.startGame();

			do {
				System.out.print("Would you like to continue? [Y/N]: ");
				userAnswer = scan.next();	
			} while (!userAnswer.equals("Y") && !userAnswer.equals("y") && !userAnswer.equals("N") && !userAnswer.equals("n"));
		} while (userAnswer.equals("Y") || userAnswer.equals("y"));		
	}
}