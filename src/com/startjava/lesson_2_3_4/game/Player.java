package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
    private int[] playerOneNumbers = new int[10];
	private int[] playerTwoNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setPlayerOneNumbers(int number, int i) {
        playerOneNumbers[i] = number;
    }

    public void setPlayerTwoNumbers(int number, int j) {
        playerTwoNumbers[j] = number;
    }

    public int[] getPlayerOneNumbers() {
        int count = 0;
        for (int i: playerOneNumbers) {
            if (i > 0) {
                count++;
            }
        }
        int[] str = Arrays.copyOf(playerOneNumbers, count);
        return str;
    }

    public int[] getPlayerTwoNumbers() {
        int count = 0;
        for (int i: playerTwoNumbers) {
            if (i > 0) {
                count++;
            }
        }
        int[] str = Arrays.copyOf(playerTwoNumbers, count);
        return str;
    }
}