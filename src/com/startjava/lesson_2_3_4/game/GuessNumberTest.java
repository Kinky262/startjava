package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		String userAnswer;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter Player_One name: ");
			Player playerOne = new Player(scan.next());
			System.out.print("Enter Player_Two name: ");
			Player playerTwo = new Player(scan.next());
			GuessNumber game = new GuessNumber(playerOne, playerTwo);
			game.startGame();

			do {
				System.out.print("\nWould you like to continue? [Y/N]: ");
				userAnswer = scan.next();	
			} while (!userAnswer.equals("Y") && !userAnswer.equals("y") && !userAnswer.equals("N") && !userAnswer.equals("n"));
		} while (userAnswer.equals("Y") || userAnswer.equals("y"));		
	}
}