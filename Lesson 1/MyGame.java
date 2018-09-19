public class MyGame {
	public static void main (String[] args) {
		int goalNum = 42; // число, "загаданное" компьютером
		int userTry = 15; // число, вводимое игроком

		for (boolean isWin = false; !isWin; ) {
			if (goalNum == userTry) {
				isWin = true;
				System.out.println("You won! --> isWin = " + isWin);
			} else if (goalNum > userTry) {
				System.out.println("The number you entered is less than what the computer");
			} else if (goalNum < userTry) {
				System.out.println("The number you entered is greater than what the computer");
			} 
		}
	}
}