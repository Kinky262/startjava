package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;
	private int randomNumber = (int) (Math.random() * 101);
	private Scanner scanPlayerNumber = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void startGame() {
		boolean isWin = false;
		int[] playerOneNumbers = new int[10];
		int[] playerTwoNumbers = new int[10];
		int i = 0;
		int j = 0;
		int k = 0;
		System.out.println("\nYou have only 10 tries only to guess the number.");
		System.out.println("Enter a number (0-100)." + randomNumber + "\n");

		while (isWin == false && k < 10) {
			System.out.print(playerOne.getPlayerName() + ": ");
			playerOne.setNumber(scanPlayerNumber.nextInt());
			playerOneNumbers[i] = playerOne.getNumber();
			i += 1;
			isWin = compareToTargetNum(playerOne);

			if (isWin == true) {
				System.out.print("You spend " + i + " tries. \nYour numbers were: ");
				for (int num : playerOneNumbers) {
					if (num > 0) {
						System.out.print(num + " ");
					}
				}
				return;
			}
			System.out.print(playerTwo.getPlayerName() + ": ");
			playerTwo.setNumber(scanPlayerNumber.nextInt());
            playerTwoNumbers[j] = playerTwo.getNumber();
			j += 1;
			isWin = compareToTargetNum(playerTwo);

			if (isWin == true) {
				System.out.print("You spend " + j + " tries. \nYour numbers were: ");
				for (int num: playerTwoNumbers) {
					if (num > 0) {
						System.out.print(num + " ");
					}
				}
				return;
			}
			k += 1;
			if (k == 10) {
                System.out.println("You are out of 10 tries. GAME OVER.");
                return;
            }
		}
	}

	public boolean compareToTargetNum(Player player) {

		if (player.getNumber() == randomNumber) {
			System.out.println("You WON!");
			return true;
		} else if (player.getNumber() < randomNumber) {
			System.out.println("The number you entered is LESS than what the computer\n");
		} else {
			System.out.println("The number you entered is GREATER than what the computer\n");
		}
		return false;
	}
}