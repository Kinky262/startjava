package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final static int COUNT_ATTEMPTS = 10;
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

        setUp(playerOne);
        setUp(playerTwo);
        System.out.println("\nYou have only 10 tries only to guess the number.");
        System.out.println("Enter a number (0-100)." + randomNumber + "\n");

        int count = 0;

        do {
            isWinner = isPlaying(playerOne, count);
            if (isWinner) {
                break;
            }
            isWinner = isPlaying(playerTwo, count);
            count++;

            if (count == COUNT_ATTEMPTS) {
                System.out.println("You are out of 10 tries. GAME OVER.");
                return;
            }
        } while (!isWinner && count < COUNT_ATTEMPTS);

        getScores(playerOne);
        getScores(playerTwo);
    }

    private void setUp(Player player) {
        randomNumber = ((int) (Math.random() * 101));
        isWinner = false;
        int[] filledSection = Arrays.copyOf(player.getNumbers(), player.getAttempts());
        Arrays.fill(filledSection, 0, player.getAttempts(), 0);
        player.setAttempts(0);
    }

    private boolean isPlaying(Player player, int count) {
        boolean isWin;

        System.out.print(player.getName() + ": ");
        player.setNumber(scanner.nextInt());
        player.setAttempts();
        player.setNumbers(player.getNumber(), count);
        isWin = compareToRandomNum(player);
        return isWin;
    }

	private boolean compareToRandomNum(Player player) {

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

	    if (player.getAttempts() != 0) {
            System.out.println(player.getName() + "'s numbers were: "
                              + Arrays.toString(Arrays.copyOf(player.getNumbers(),
                                player.getAttempts())));
        }
    }
}