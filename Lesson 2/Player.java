import java.util.Scanner;

public class Player {
	private String playerName;
	private int number;
	Scanner playerNumber = new Scanner(System.in);

	public String getPlayerName() {
		return playerName;
	}
	public int getNumber() {
		return number;
	}

	public Player (String name) {
		playerName = name;
	}

	public void guess() {
		number = playerNumber.nextInt();
	}
}