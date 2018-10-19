package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int number;
	private int attempts;
    private int[] playersNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
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

    public void setAttempts(int value) {
        attempts = value;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setNumbers(int number, int i) {
        playersNumbers[i] = number;
    }

    public int[] getNumbers() {
        return playersNumbers;
    }
}