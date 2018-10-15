package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
	private int attempts;
    private int[] playersNumbers = new int[10];

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

    public void setAttempts() {
        attempts++;
    }

    public void resetAttempts() {
        attempts = 0;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setPlayersNumbers(int number, int i) {
        playersNumbers[i] = number;
    }

    public int[] getPlayersNumbers() {
       return Arrays.copyOf(playersNumbers, attempts);
    }

    public void resetValues() {
        Arrays.fill(playersNumbers, 0, attempts, 0);
    }
}