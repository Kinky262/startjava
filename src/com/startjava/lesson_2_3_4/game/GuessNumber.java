package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;
    private int randomNumber;
    private boolean isWinner;
	private Scanner scanner = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
        randomNumber = ((int) (Math.random() * 101));
        isWinner = false;

        init(playerOne);
        init(playerTwo);
        System.out.println("\nYou have only 10 tries only to guess the number.");
        System.out.println("Enter a number (0-100)." + randomNumber + "\n");

        int count = 0;
        int i = 0;
        while (!isWinner && count < 10) {
            isWinner = isPlaying(playerOne, randomNumber, i);

            if (isWinner) {
                return;
            }
            isWinner = isPlaying(playerTwo, randomNumber, i);
            i++;
            count++;

            if (count == 10) {
                System.out.println("You are out of 10 tries. GAME OVER.");
                return;
            }
        }
    }

    private void init(Player player) {
        Arrays.fill(Arrays.copyOf(player.getNumbers(), player.getAttempts()), 0,
                  player.getAttempts(), 0);
        player.setAttempts(0);
    }

    private boolean isPlaying(Player player, int randomNumber, int i) {
        boolean isWin;

        System.out.print(player.getName() + ": ");
        player.setNumber(scanner.nextInt());
        player.setAttempts();
        player.setNumbers(player.getNumber(), i);
        isWin = compareToTargetNum(player, randomNumber);

        if (isWin) {
            getScores(playerOne);
            getScores(playerTwo);
            return true;
        }
        return false;
    }

	private boolean compareToTargetNum(Player player, int randomNumber) {

		if (player.getNumber() == randomNumber) {
			System.out.println("\nYou WON!\n");
            System.out.println("Player " + player.getName() + " guessed the number "
                        + randomNumber + " with " + player.getAttempts() + " attempt(s).");
			return true;
		} else if (player.getNumber() < randomNumber) {
			System.out.println("The number you entered is LESS than what the computer\n");
		} else {
			System.out.println("The number you entered is GREATER than what the computer\n");
		}
		return false;
	}

    private void getScores(Player player) {
	    if (player.getNumbers().length == 0) {
            return;
        } else {
            System.out.println(player.getName() + "'s numbers were: "
                              + Arrays.toString(Arrays.copyOf(player.getNumbers(),
                                player.getAttempts())));
        }
    }
}