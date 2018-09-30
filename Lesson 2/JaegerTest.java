public class JaegerTest {

	public static void main(String[] args) {

		Jaeger robot1 = new Jaeger();
		robot1.setName("Coyote Tango");
		System.out.println("New Jaeger '" + robot1.getName() + "' was created.");
		robot1.move();

		Jaeger robot2 = new Jaeger();
		robot2.setName("Gipsy Danger");
		robot2.setMark("Mark-3");
		System.out.println("New Jaeger '" + robot1.getName() + "' was created.");
		robot2.setHeight(79.25f);
		System.out.println("Jaeger '" + robot2.getName() + "' has " + robot2.getHeight() + " height.");
		robot2.move();

		robot1.setName("Coyote Tango-2");
		System.out.println("First Jaeger has been renamed to " + robot1.getName());
	}
}