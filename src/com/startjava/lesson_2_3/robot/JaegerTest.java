package com.startjava.lesson_2_3.robot;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2312.0f, 5, 7, 4);
		System.out.println("New Jaeger '" + coyoteTango.getName() + "' was created.");
		System.out.println("Jaeger's details: \n" + coyoteTango.toString());
		coyoteTango.move();

		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1980.0f, 7, 8, 6);
		System.out.println("New Jaeger '" + gipsyDanger.getName() + "' was created.");
		gipsyDanger.move();

		coyoteTango.setName("Coyote Tango-2");
		System.out.println("First Jaeger has been renamed to " + coyoteTango.getName());
		System.out.println("New details: \n" + coyoteTango.toString());
	}
}