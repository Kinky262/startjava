package com.startjava.lesson_2_3.game;

public class Player {
	private String playerName;
	private int number;

	public Player(String name) {
		playerName = name;
	}

	public void setPlayerName(String name) {
		playerName = name;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}