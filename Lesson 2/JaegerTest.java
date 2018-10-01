public class JaegerTest {

	public static void main(String[] args) {
		Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2312.0f, 5, 7, 4);
		System.out.println("New Jaeger '" + coyoteTango.getName() + "' was created.");
		System.out.println("Jaeger's details: \n" +
							"Model name: " + coyoteTango.getName()     + "\n" + 
							"Mark: "	   + coyoteTango.getMark()     + "\n" +
							"Origin: "     + coyoteTango.getOrigin()   + "\n" +
							"Height: "     + coyoteTango.getHeight()   + "\n" +
							"Weight: "     + coyoteTango.getWeight()   + "\n" +
							"Speed: "      + coyoteTango.getSpeed()    + "\n" +
							"Strenght: "   + coyoteTango.getStrenght() + "\n" +
							"Armor: "      + coyoteTango.getArmor()    + "\n" );
		coyoteTango.move();

		Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1980.0f, 7, 8, 6);
		System.out.println("New Jaeger '" + gipsyDanger.getName() + "' was created.");
		gipsyDanger.move();

		coyoteTango.setName("Coyote Tango-2");
		System.out.println("First Jaeger has been renamed to " + coyoteTango.getName());
		System.out.println("New details: \n" +
							"Model name: " + coyoteTango.getName()     + "\n" + 
							"Mark: "	   + coyoteTango.getMark()     + "\n" +
							"Origin: "     + coyoteTango.getOrigin()   + "\n" +
							"Height: "     + coyoteTango.getHeight()   + "\n" +
							"Weight: "     + coyoteTango.getWeight()   + "\n" +
							"Speed: "      + coyoteTango.getSpeed()    + "\n" +
							"Strenght: "   + coyoteTango.getStrenght() + "\n" +
							"Armor: "      + coyoteTango.getArmor()    + "\n" );
	}
}