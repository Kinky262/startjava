package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;

	private Scanner scanner = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame(int randomNumber) {
		boolean isWin = false;
		int i = 0;
		int j = 0;

        System.out.println("\nYou have only 10 tries only to guess the number.");
		System.out.println("Enter a number (0-100)." + randomNumber + "\n");

        int k = 0;
        while (!isWin && k < 10) {
			System.out.print(playerOne.getPlayerName() + ": ");
			playerOne.setNumber(scanner.nextInt());
			playerOne.setPlayerOneNumbers(playerOne.getNumber(), i);
            isWin = compareToTargetNum(playerOne, randomNumber, i);
            i++;

			if (isWin) {
				return;
            }
            System.out.print(playerTwo.getPlayerName() + ": ");
            playerTwo.setNumber(scanner.nextInt());
            playerTwo.setPlayerTwoNumbers(playerTwo.getNumber(), j);
            isWin = compareToTargetNum(playerTwo, randomNumber, j);
            j++;

            k++;

            if (k == 10) {
                System.out.println("You are out of 10 tries. GAME OVER.");
                return;
            }
        }
    }

	public boolean compareToTargetNum(Player player, int randomNumber, int attempt) {

		if (player.getNumber() == randomNumber) {
			System.out.println("\nYou WON!\n");
            System.out.println("Player " + player.getPlayerName() + " guessed the number " +
                    randomNumber + " with " + (attempt + 1) + " attempt(s).");
			return true;
		} else if (player.getNumber() < randomNumber) {
			System.out.println("The number you entered is LESS than what the computer\n");
		} else {
			System.out.println("The number you entered is GREATER than what the computer\n");
		}
		return false;
	}

	public void fin() {
        System.out.println(playerOne.getPlayerName() + "'s numbers were: "
                + Arrays.toString(playerOne.getPlayerOneNumbers()));

        if (playerTwo.getPlayerTwoNumbers().length == 0) {
            return;
        } else {
            System.out.print(playerTwo.getPlayerName() + "'s numbers were: "
                    + Arrays.toString(playerTwo.getPlayerTwoNumbers()) + "\n");
        }
    }
}