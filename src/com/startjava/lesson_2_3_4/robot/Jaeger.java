package com.startjava.lesson_2_3_4.robot;

public class Jaeger {

	private String modelName;
	private String mark;
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strenght;
	private int armor;

	public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strenght, int armor) {
		this.modelName = modelName;
		this.mark = mark;
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strenght = strenght;
		this.armor = armor;
	}

	public void setName(String name) {
		modelName = name;
	}

	public String getName() {
		return modelName;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark() {
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin() {
		return origin;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight() {
		return height;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getWeight() {
		return weight;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public int getStrenght() {
		return strenght;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getArmor() {
		return armor;
	}

	void move() {
		System.out.println("Jaeger '" + modelName + "' is moving... \n");
	}

	public String toString() {
		return  " [Model name = " + modelName + "]\n" +
				" [Mark = " 	  + mark 	  + "]\n" +
				" [Origin = " 	  + origin 	  + "]\n" +
				" [Height = "	  + height 	  + "]\n" +
				" [Weight = "	  + weight 	  + "]\n" +
				" [Speed = " 	  + speed 	  + "]\n" +
				" [Strenght = "   + strenght  + "]\n" +
				" [Armor = " 	  + armor 	  + "]\n";
	}
}