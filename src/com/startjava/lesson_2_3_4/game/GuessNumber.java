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

	public void startGame() {
        int randomNumber = ((int) (Math.random() * 101));
        boolean isWinner = false;
        int i = 0;

        playerOne.resetValues();
        playerTwo.resetValues();
        playerOne.resetAttempts();
        playerTwo.resetAttempts();

        System.out.println("\nYou have only 10 tries only to guess the number.");
		System.out.println("Enter a number (0-100)." + randomNumber + "\n");

        int k = 0;
        while (!isWinner && k < 10) {
            isWinner = keepPlaying(playerOne, randomNumber, i);

            if (isWinner) {
                return;
            }
            isWinner = keepPlaying(playerTwo, randomNumber, i);
            i++;
            k++;

            if (k == 10) {
                System.out.println("You are out of 10 tries. GAME OVER.");
                return;
            }
        }
    }

	private boolean compareToTargetNum(Player player, int randomNumber) {

		if (player.getNumber() == randomNumber) {
			System.out.println("\nYou WON!\n");
            System.out.println("Player " + player.getPlayerName() + " guessed the number "
                        + randomNumber + " with " + player.getAttempts() + " attempt(s).");
            getScores(playerOne);
            getScores(playerTwo);
			return true;
		} else if (player.getNumber() < randomNumber) {
			System.out.println("The number you entered is LESS than what the computer\n");
		} else {
			System.out.println("The number you entered is GREATER than what the computer\n");
		}
		return false;
	}

    private void getScores(Player player) {
	    if (player.getPlayersNumbers().length == 0) {
            return;
        } else {
            System.out.println(player.getPlayerName() + "'s numbers were: "
                              + Arrays.toString(player.getPlayersNumbers()));
        }
    }

    private boolean keepPlaying(Player player, int randomNumber, int i) {
	    boolean isWin;

        System.out.print(player.getPlayerName() + ": ");
        player.setNumber(scanner.nextInt());
        player.setAttempts();
        player.setPlayersNumbers(player.getNumber(), i);
        isWin = compareToTargetNum(player, randomNumber);

        if (isWin) {
            return true;
        }
        return false;
    }
}